package listaExercVetor;
import java.util.Scanner;
public class exercVetor4 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=10;
        double media;
        int a[],soma=0,i;
        a = new int [TAM];
        
        for(i=0;i<TAM;i++){
            System.out.println("Digite o "+(i+1)+"° Valor:");
            a[i]=ler.nextInt();
            soma +=a[i];
        }
        media = soma/TAM;
        System.out.println("A media dos valores é "+media);
     
        ler.close();
    }
}