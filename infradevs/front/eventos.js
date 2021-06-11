function filtrar() {

    fetch ("http://localhost:8080/intervalo/" +
    document.getElementById("txtinicio").value 
    + "/" +
    document.getElementById("txttermino").value)
    .then(res => res.json())
    .then(res => {
        var tabela = 
        "<table border='1' align='center' width='100%'>" +
        "<tr>" +
        "<th align='center'>ID Evt</th>" +
        "<th>Data</th>" +
        "<th>Equipamento</th>" +
        "<th>IP</th>" +
        "<th>Alarme</th>" +
        "<th>Descrição</th>" +
        "</tr>";
                      
        for (contador=0;contador<res.length;contador++) {
          
            tabela+=
            "<tr>" +
            "<td align='center'>" + res[contador].id + "</td>" +
            "<td>" + res[contador].data + "</td>" +
            "<td>" + res[contador].equipamento.nomeEquipamento + "</td>" +
            "<td>" + res[contador].equipamento.numIp + "</td>" +
            "<td>" + res[contador].alarme.nomeAlarme + "</td>" +
            "<td>" + res[contador].alarme.descricao + "</td>" +
            "</tr>";
        }
        
        tabela+="</table>";
        document.getElementById("resultado").innerHTML = tabela;

    })
    .catch(err => {
        window.alert("Nenhum evento encontrado")
    });

}


function validausuario() {

    var userstr = localStorage.getItem("userlogado");
    if (userstr==null){
        window.location = "login.html";
    } }

function sair() {

    localStorage.removeItem("userlogado");
    window.location = "login.html"
    
}
  