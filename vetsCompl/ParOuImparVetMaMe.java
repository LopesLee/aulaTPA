package listaComplementar;

import java.util.Scanner;

public class ParOuImparVetMaMe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// declarando variáveis
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];

		// criando laços
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (1 + i) + "°. elemento do vetor A:");
			a[i] = in.nextInt();

			System.out.println("Entre com o " + (1 + i) + "°. elemento do vetor B:");
			b[i] = in.nextInt();

			// condições
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
