package listaComplementar;
import java.util.Scanner;
public class Par_Impar {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            final int TAM = 5;
        				int a[], b[], i;
        				a = new int [TAM];
        				b = new int [TAM];
        
        				
        //la�o para leitura do vetor A
        for (i=0; i<TAM; i++){
            System.out.println("Digite o "+(i+1)+"� valor do vetor A");
            a [i] = leia.nextInt();
            
        }
        //�ndices para posi��o do vetor
        	int cmc = 0;
        	int fim = TAM-1;
        
        	System.out.print( " \nb = [ ");
        	
        //la�o para conter nos espa�os iniciais ou restantes
        	for (i=0; i<TAM; i++) {
        		if (a[i]%2==0){
        //se resta 0 ent�o posi��es iniciais
        			b[cmc] = a[i];
        			cmc++;
        		}else {
        //sen�o, posi��es restantes
        			b[fim] = a[i];
        			fim--;
        							        
        							    }
        							    
        							}
        
        //la�o para apresentar o vetor B						      
        	for (i = 0; i < TAM; i++) {
        		System.out.print(b[i]+" ");
    }
        	System.out.print("]");  							    
        
      leia.close(); 
    }
      
}