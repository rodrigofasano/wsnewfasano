function filtrar() {

    fetch ("http://localhost:8080/alarmes/") 
      
    .then(res => res.none())
    .then(res => {
        var tabela = 
        "<table border='1' align='center' width='100%'>" +
        "<tr>" +
        "<th>ID Alarme</th>" +
        "<th>Nome do Alarme</th>" +
        "<th>Descrição</th>" +
       
        "</tr>";
                      
        for (contador=0;contador<res.length;contador++) {
          
            tabela+=
            "<tr>" +
            "<td align='center'>" + res[contador].id + "</td>" +
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
