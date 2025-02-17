package ex2;



public class ordenar {
	public ordenar()
	  { super();
		  
	  }
	  
	  public int  fatorial (int  N) 
	  { 
		
		 //condição de parada 
		  if (N == 1)
		  {return 1;}
		  else 
		  {  return N = N * fatorial(N-1);
			  
		  }
		      
	  }
}
