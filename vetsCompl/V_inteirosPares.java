package exs15;
import java.util.*;
public class V_inteirosPares {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		// declarando vari�veis
		final int TAM = 10;
		int i, a[], n;
		a = new int[TAM];

		// criando la�os
		for (i = 0; i < TAM; i++) {
			System.out.print("Entre com o " + (i + 1) + "�. n�mero:");
			a[i] = in.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("Elemento " + (i + 1) + " do vetor A: " + a[i]);
			System.out.println(" Pares de 0 at� o elemento " + a[i] + ": ");

			for (n = 0; n <= a[i]; n++) {
				if (n % 2 == 0) {
					System.out.println(n + " ");
				}
				System.out.println();
			}
		}
	}
}
