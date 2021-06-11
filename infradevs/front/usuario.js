function exibirusuario() {

    var userstr = localStorage.getItem("userlogado");
    if (userstr==null){
        window.location = "login.html";
    }else{
        var userjson = JSON.parse(userstr);
        document.getElementById("foto").innerHTML =
        "<img src=img/" + userjson.foto + " width=80 heigth=80>";
        document.getElementById("dados").innerHTML = 
        "<h4>" + userjson.nome + "<br>" + userjson.email + "</h4>"
       
    }


}

function logar() {

    var carta = {
        email: document.getElementById("txtemail").value,
        senha: document.getElementById("txtsenha").value
    };

    var envelope = {
        method: "POST",
        body: JSON.stringify(carta),
        headers: {
            "Content-type": "application/json"
        }

    };
    
    fetch("http://localhost:8080/login", envelope)
    .then(res => res.json())
    .then(res => {
        localStorage.setItem("userlogado",JSON.stringify(res) )
        window.location = "usuario.html"; 
    })
    .catch(err =>{
        window.alert("não foi possível realizar o Login. Verique o e-mail e senha digitados, e tente novamente.");
    });
  
}

function sair() {

  localStorage.removeItem("userlogado");
  window.location = "login.html"
  
}

