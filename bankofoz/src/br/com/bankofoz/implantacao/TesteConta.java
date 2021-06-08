package br.com.bankofoz.implantacao;

import javax.swing.JOptionPane;



import br.com.bankofoz.modelo.Agencia;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		
       Cliente cliente = new Cliente(1, "Rodrigo","328.469.198.79");
       Agencia agencia = new Agencia(123,"Gama","0000-1111");
       double saldo = 1000;
       int numero = 123456;
       Conta conta = new Conta();
       if (JOptionPane.showConfirmDialog(null , "Conta Corrente?", "Validar conta", JOptionPane.YES_NO_OPTION)==0) {
    	   conta =  new Corrente(
    			   numero,
    			   saldo,
    			   cliente,
    			   agencia,
    			   5000, // limite
    			   50  // taxa conta corrente
    			   );
       }else {
    	   conta = new Poupanca(
    			   numero,
    			   saldo,
    			   cliente,
    			   agencia,
    			   0.05,  // rendimento
    			   10 // dia do aniversario da poupanca
    			   );
       }
       
       System.out.println("Sacar: " +  conta.sacar(2000));
       System.out.println(conta.toString());
       System.out.println(conta.getResumo());
      
       
	}

}
