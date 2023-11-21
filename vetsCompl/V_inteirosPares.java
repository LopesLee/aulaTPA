package exs15;
import java.util.*;
public class V_inteirosPares {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		// declarando variáveis
		final int TAM = 10;
		int i, a[], n;
		a = new int[TAM];

		// criando laços
		for (i = 0; i < TAM; i++) {
			System.out.print("Entre com o " + (i + 1) + "°. número:");
			a[i] = in.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("Elemento " + (i + 1) + " do vetor A: " + a[i]);
			System.out.println(" Pares de 0 até o elemento " + a[i] + ": ");

			for (n = 0; n <= a[i]; n++) {
				if (n % 2 == 0) {
					System.out.println(n + " ");
				}
				System.out.println();
			}
		}
	}
}
