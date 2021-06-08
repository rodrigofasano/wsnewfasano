package br.com.caicaielavator.modelo;

public class Elevador {


	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capcidadePessoas;
	private int qtdePessoas;
	private int andarAtual;

	public void entrar (int qtde) {
		int resultado = qtdePessoas + qtde;
		if (resultado<=capcidadePessoas) {
			qtdePessoas+=qtde;
		}
	}

	public void sair (int qtde) {
		int resultado = qtdePessoas - qtde;
		if (resultado>=0) {
			qtdePessoas-=qtde;
		}
	}

	public void sair () {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}

	public String descer () {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Desce";
		}else {
			return "Já esta no Térreo";
		}
	}

	public String subir () {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Sobe";
		}else {
			return "Já esta no último aandar";
		}
	}

	public String retornarResumo() {
		return 
				"Nome do elevador....: " + nome +"\n" + 
				"Andar atual.........: " + andarAtual + "\n" +
				"Quatidade de pessoas: " + qtdePessoas;
	}

	public void inicializar	(int pAndarMax, int pAndarMin, int pCapPessoas ) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capcidadePessoas = pCapPessoas;
	}


	public String retornaNome() {
		return nome;	
	}

	public void preencherNome(String param) {
		nome = param;
	}
















}

