package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {



		int data_ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano:"));
		int data_mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mês:"));
		int data_dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia:"));

		while (data_ano<1920 || data_ano>2003) {
			data_ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		}

		while (data_mes<1 || data_mes>12) {
			data_mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		}

		if (data_mes==2) { // o mes com 29 dias
			while(data_dia<1 || data_dia>29) {
		        data_dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}else if(data_mes==4 || data_mes==6 || data_mes==9 || data_mes==11) { // para os meses com 30 dias
			while(data_dia<1 || data_dia>30) {
				data_dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}else { // para os meses com 31 dias
			while(data_dia<1 || data_dia>31) {
				data_dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}

		System.out.println("Data: " + data_dia + "/" + data_mes + "/" + data_ano);

	}
}


/*
 * Capturem separadamente: dia mes e ano
 * 
 * Para o dia somente será aceito aqtd de dias de acordo com o m^s (considere fevereiro somente com 29 dias)
 * 
 * Para o mês aceite somente valores entre 1 e 12
 * 
 * Para o ano aceite somente valores entre 2003  1920
 * 
 */

