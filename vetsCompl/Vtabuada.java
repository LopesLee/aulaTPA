package exs15;

public class Vtabuada {
	  public static void main(String[] args) {
	       
	        //declarar vari�veis
	        final int TAM= 5;
	        int i, a[], t, j;
	        a = new int[TAM];
	        
	        //criando la�o
	        for(i=0; i < TAM; i++){
	            
	            //Calculando
	            
	                a[i] = i+1;
	        
	        for(j=1; j<=10; j++){
	        System.out.println("O valores da tabuada do " +(i + 1)+ " s�o: " +a[i]+" x " +j+ "=" +(t=j*a[i]));
	        System.out.println();
	        }
	        }
	    }
	}

