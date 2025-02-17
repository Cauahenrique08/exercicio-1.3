package view;

import javax.swing.JOptionPane;

import ex2.ordenar;

public class principal3 
{

	public static void main(String[] args) 
	{
		ordenar ordenar =new ordenar();
		
		 int numero = 14;
	     while(numero > 13)
	     {
	    	 
	     
			 numero = Integer.parseInt(JOptionPane.showInputDialog
	             ("Insira um número inteiro maior que zero: "));
		 }
	 
     
     int resultado = ordenar.fatorial(numero);
     System.out.println(resultado);
	}

}
