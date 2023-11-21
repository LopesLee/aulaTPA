import java.util.Scanner;
public class maiorMenorI {
 public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int maiorI=0, menorI=0, i=1;

        while (i<=10) {
            System.out.print("Digite a idade da pessoa "+i+":");
          i = ler.nextInt();

            if (i>=18) {
                maiorI++;
            } else {
                menorI++;
            }
        System.out.println("Quantidade de pessoas maiores de idade é "+maiorI+" e de menor é "+menorI);
        }
       }

}
