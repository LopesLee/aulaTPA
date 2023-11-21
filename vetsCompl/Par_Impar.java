package listaComplementar;
import java.util.Scanner;
public class Par_Impar {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            final int TAM = 20;
        				int a[], b[], i;
        				a = new int [TAM];
        				b = new int [TAM];
        
        				
        //laço para leitura do vetor A
        for (i=0; i<TAM; i++){
            System.out.println("Digite o "+(i+1)+"° valor do vetor A");
            a [i] = leia.nextInt();
            
        }
        //índices para posição do vetor
        	int cmc = 0;
        	int fim = TAM-1;
        
        	System.out.print( " \nb = [ ");
        	
        //laço para conter nos espaços iniciais ou restantes
        	for (i=0; i<TAM; i++) {
        		if (a[i]%2==0){
        //se resta 0 então posições iniciais
        			b[cmc] = a[i];
        			cmc++;
        		}else {
        //senão, posições restantes
        			b[fim] = a[i];
        			fim--;
        							        
        							    }
        							    
        							}
        
        //laço para apresentar o vetor B						      
        	for (i = 0; i < TAM; i++) {
        		System.out.print(b[i]+" ");
    }
        	System.out.print("]");  							    
        
      leia.close(); 
    }
      
}
