import java.util.Scanner;

public class tabuadaNum{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int n, i=1
        System.out.print("Digite o numero da tabuada: ");
         n=ler.nextInt();

        while(i<=10) {
            System.out.println(n"x"+i+"="+(n*i));
            i++;
        }
    }
}
