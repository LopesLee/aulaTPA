package exs15;

import java.util.*;

public class V_somatoria {
	public static void main(String[] args) {
		int TAM = 10;
		int[] A = new int[TAM];
		int[] B = new int[TAM];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o valor de A[" + i + "]: ");
			A[i] = in.nextInt();
		}
		int somatorio = 0;
		for (int i = TAM - 1; i >= 0; i--) {
			somatorio += A[i];
			B[i] = somatorio;
		}
		System.out.println("Vetor B (Somatório):");
		for (int i = 0; i < TAM; i++) {
			System.out.println("B[" + i + "] = " + B[i]);
		}
		in.close();
	}
}
