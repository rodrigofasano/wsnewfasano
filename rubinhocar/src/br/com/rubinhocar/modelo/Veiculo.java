package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// modificador = private, public
	// tipo do retorno = void 
	// nome do metodo 
	// 
	// <modificador> <tipo do retorno> <nome do metodo> (tipo do param> <nome do param>, ....){

	public String retornarTudo() {
		String xpto = "NÃO";
		if (status==true) {
			xpto = "SIM";
		}
		return 
				"Modelo..........: " + modelo + "\n" +
				"Valor...........: " + valor + "\n" +
				"Velocidade......: " + velocidadeAtual + "\n" +
				"Ligado?.........: " + xpto;
	}

	public void desacelerar () {
		velocidadeAtual=0;
	}

	public void desacelerar(int param) {
		if (status==true) {
			velocidadeAtual-=param;
		}
	}

	public String desligar() {
		velocidadeAtual=0;
		status=true;
		return "Desligado";
	}

	public String ligar() {
		status=true;
		return "Ligado";
	}

	public double retornaValor () {
		return valor;
	}	

	public void acelerar(int param) {
		if (status==true) {
			velocidadeAtual+=param;  
		}
	}

	public void preencherValor(double param) {
		if (param>=0) {
		valor = param;
		}
	}

	public String retornarModelo() {
		return modelo;
	}

	public void preencherModelo(String param) {
		if (param.length()<10) {
			modelo = param.toUpperCase();	
		}
	}


}	
