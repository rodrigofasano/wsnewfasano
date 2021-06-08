package repeticao;

import javax.swing.JOptionPane;

public class TabuadaFor2 {
	public static void main(String[] args) {
		
		int tabuada= Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		int contador=0;
		while(contador<=100) {
			System.out.println(tabuada + " X " +contador + " = " + (tabuada*contador));
			contador++;
		}
	}

}
