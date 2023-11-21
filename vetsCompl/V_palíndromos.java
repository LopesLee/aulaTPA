package exs15;

import java.util.*;

public class V_pal�ndromos {
	public class quest12 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			final int TAM = 10;
			int[] A = new int[TAM];

			System.out.println("Digite 10 n�meros inteiros para preencher o vetor A: ");
			for (int i = 0; i < TAM; i++) {
				A[i] = in.nextInt();
			}

			int i = 0;
			while (i < TAM / 2 && A[i] == A[TAM - 1 - i]) {
				i++;
			}

			if (i == TAM / 2) {
				System.out.println("O vetor � um pal�ndromo.");
			} else {
				System.out.println("O vetor n�o � um pal�ndromo.");
			}
		}
	}
}
