package exs15;

import java.util.*;

public class V_parImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// declarando vari�veis
		final int TAM = 20;
		int i, a[], b[];
		a = new int[TAM];
		b = new int[TAM];

		// criando la�os
		for (i = 0; i < TAM; i++) {
			System.out.print("Entre com o " + (i + 1) + "o. n�mero:");
			a[i] = in.nextInt();
			// indentificando pares e impares
			if (a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.println("Par.");
			} else {
				System.out.println("Impar.");
			}

		}
	}
}
