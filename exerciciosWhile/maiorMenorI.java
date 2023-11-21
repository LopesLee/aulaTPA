import java.util.Scanner;
public class maiorMenorI {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoA, anoN, idade, i;
          do{
              System.out.println("Digite o ano atual:");
                anoA=ler.nextInt();
              System.out.println("Digite seu ano de nascimento:");
                anoN=ler.nextInt();
              idade=anoA-anoN;
            
            if(idade>=18){
                System.out.println("Você tem "+idade+", maior de idsde.");
            }else{
                System.out.println("Você tem "+idade+", menor de idade.");
            }
            
            System.out.println("Continuar a execução, se sim digite 1, senão digite 2");
            i=ler.nextInt();
        
          }while(i==1);
    }
}
