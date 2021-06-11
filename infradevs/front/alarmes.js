function validausuario() {

    var userstr = localStorage.getItem("userlogado");
    if (userstr==null){
        window.location = "login.html";
    } else {
      carregar();  
    }}

function sair() {

    localStorage.removeItem("userlogado");
    window.location = "login.html"
    
}

function carregar() {

     fetch ("http://localhost:8080/alarmes")
    .then(res => res.json())
    .then(res => {
        var tabela = 
        "<table border='1' align='center' width='100%'>" +
        "<tr align='center'>" +
        "<th>ID Alarme</th>" +
        "<th>Alarmes</th>" +
        "<th>Descrição</th>" +
        "</tr>";
                      
        for (contador=0;contador<res.length;contador++) {
          
            tabela+=
            "<tr>" +
            "<td align='center'>" + res[contador].id + "</td>" +
            "<td>" + res[contador].nomeAlarme + "</td>" +
            "<td>" + res[contador].descricao + "</td>" +
            "</tr>";
        }
        
        tabela+="</table>";
        document.getElementById("resultado").innerHTML = tabela;

    })
    .catch(err => {
        window.alert("Nenhum evento encontrado")
    });

}