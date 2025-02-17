package view;

import javax.swing.JOptionPane;

import ex2.ordenar; // importando biblioteca com a recursivade

public class principal3 
{

	public static void main(String[] args) 
	{
		ordenar ordenar =new ordenar();
		
		 int numero = 14;
	     while(numero >= 13) // garantindo que o valor não seja maior que 12
	     {
	    	 
	     
			 numero = Integer.parseInt(JOptionPane.showInputDialog
	             ("Insira um número inteiro maior que zero: "));
		 }
	 
     
     int resultado = ordenar.fatorial(numero);
     System.out.println(resultado);
	}

}
