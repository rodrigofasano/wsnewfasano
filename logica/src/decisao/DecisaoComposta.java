package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
        
	    public static void main(String[] args) {
	
        String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
        float media = (nota1+nota2)/2;
        
        if (media>=6) {
        	System.out.println("Parab�ns voc� foi aprovado!");
        	
        }
        
        else if (media<4) {
        	System.out.println("Ops! Voc� foi reprovado!");
        	
        }
        
        else if (media<6 && media>=4) {
        	System.out.println("Ops! Voc� ficou de exame!");
        	
        }
        
        System.out.println("Sua m�dia na disciplina: " + disciplina + " foi: " + media);
        
        
        	
        	
        	
        	
        	
        }
}
