package exs15;

import java.util.*;

public class V_parImparComVetorC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// declarando vari�veis
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];

		// criando la�os
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (1 + i) + "o. elemento do vetor A[]:");
			a[i] = in.nextInt();

			System.out.println("Entre com o " + (1 + i) + "o. elemento do vetor B[]:");
			b[i] = in.nextInt();

			// atribuindo condi��es
			if (a[i] > b[i]) {
				c[i] = 1;
				System.out.println("Maior. Vetor C recebe[ " + c[i] + " ].");
			} else if (a[i] == b[i]) {
				c[i] = 0;
				System.out.println("Igual. Vetor C recebe[ " + c[i] + " ].");
			} else {
				c[i] = -1;
				System.out.println("Menor. Vetor C recebe[ " + c[i] + " ].");
			}
			System.out.println();
		}
	}
}
