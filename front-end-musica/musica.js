function filtrar() {

    fetch ("http://localhost:8080/intervalo/" +
    document.getElementById("txtinicio").value 
    + "/" +
    document.getElementById("txttermino").value)
    .then(res => res.json())
    .then(res => {
        var tabela = 
        "<table border='1' align='center' width='80%'>" +
        "<tr>" +
        "<th>Música</th>" +
        "<th>Artista</th>" +
        "<th>Cadastro</th>" +
        "<th>Lançamento</th>" +
        "</tr>";
                      
        for (contador=0;contador<res.length;contador++) {
            var opcao="SIM";
            if (res [contador].lancamento ==0 ) {
                opcao="NÃO";
            }
            tabela+=
            "<tr>" +
            "<td>" + res[contador].titulo + "</td>" +
            "<td>" + res[contador].artista.nomeArtistico + "</td>" +
            "<td>" + res[contador].cadastro + "</td>" +
            "<td>" + opcao + "</td>" +
            "</tr>";
        }
        
        tabela+="</table>";
        document.getElementById("resultado").innerHTML = tabela;

    })
    .catch(err => {
        window.alert("Música não encontrada")
    });

}
