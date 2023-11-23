package exs15;

public class TabuadaVetor {
	public static void main(String[] args) {
		       
		        //declarar variáveis
		        final int TAM= 5;
		        int i, a[], t, m;
		        a = new int[TAM];
		        
		        //criando laço
		        for(i=0; i < TAM; i++){
		            
		            //Calculando
		            System.out.println();
		                a[i] = i+1;
		        
		        for(m=1; m<=10; m++){
		        System.out.println(+a[i]+" x " +m+ "=" +(t=m*a[i]));
		        
		        }
		       }
		    }
}

	}

