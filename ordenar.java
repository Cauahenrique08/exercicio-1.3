package ex2;



public class ordenar {
	public ordenar()
	  { super();
		  
	  }
	  
	  public int  fatorial (int  N) 
	  { 
		
		 //condição de parada, pois caso seja N == 1 não necessita multiplicar por 1 pois dará o mesmo valor.
		  if (N == 1)
		  {return 1;}
		  else 
		  {  return N = N * fatorial(N-1); // retorna o resultado da recursividade
			  
		  }
		      
	  }
}
