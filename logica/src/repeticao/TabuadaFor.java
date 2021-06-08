package repeticao;

import javax.swing.JOptionPane;

public class TabuadaFor {
	public static void main(String[] args) {
		
		int tabuada= Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=0;contador<11;contador+=1) {
			System.out.println(tabuada + " X " +contador + " = " + (tabuada*contador));
					
		}
	}

}
