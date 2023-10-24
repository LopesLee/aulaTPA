package listaExercVetor;
import java.util.Scanner;
public class exercVetor2{
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=5; 
        int a[],b[],c[],i;
        a = new int[TAM];
        b= new int[TAM];
        c = new int[TAM];


        for (i=0; i<TAM; i++) { 
            System.out.println("Digite o "+(i+1)+"° Valor para A");
            a[i]= ler.nextInt();
        }
        for (i=0; i<TAM; i++) { System.out.println("Digite o "+(i+1)+"° Valor para B");
            b[i]= ler.nextInt(); 
            c[i]=a[i]+b[i];
        }
        System.out.print("\nC = ");
        for (i=0; i<TAM; i++){
            System.out.print(c[i]+"  ");
        	}
        ler.close();
        }
    }