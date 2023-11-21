package exs15;

import java.util.*;

public class V_diferentes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int Tam = 10;
		int[] A = new int[Tam];
		int[] B = new int[Tam];
		int[] C = new int[Tam];
		int k = 0;
		
		System.out.println("escreva 10 numeros para o conjunto A: ");
		for (int i = 0; i < Tam; i++) {
			A[i] = in.nextInt();
		}
		System.out.println("escreva 10 numeros para o conjunto B: ");
		for (int i = 0; i < Tam; i++) {
			B[i] = in.nextInt();
			in.close();
		}

		for (int i = 0; i < Tam; i++) {
			int j;
			for (j = 0; j < Tam; j++) {
				if (A[i] == B[j]) {
					break;
				}
			}
			if (j == Tam) {
				C[k] = A[i];
				k++;
			}
		}

		System.out.println("Vetor C (diferença dos conjuntos A e B): ");
		for (int i = 0; i < k; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
