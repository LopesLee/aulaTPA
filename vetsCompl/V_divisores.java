package exs15;

public class V_divisores {
	 public static void main(String[] args) {
		 
	        //declarando variáveis
	        final int TAM =10;
	        int b, a[], i, j;
	        a = new int[TAM];
	        
	        //criando laços    
	        for (i = 0; i < TAM; i++) {
	            a[i] = i + 1; 
	        }

	        
	        for (i = 0; i < TAM; i++) {
	            b = a[i];
	            System.out.println("Elemento " + b + " Seu Divisores = ");
	            
	            for (j = 1; j <= b; j++) {
	                if (b == 0) {
	                    System.out.println(j + " ");
	                }
	            }
	        }
	    }

}
