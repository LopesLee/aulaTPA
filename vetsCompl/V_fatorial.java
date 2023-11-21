package exs15;

public class V_fatorial {
	public static void main(String[] args) {
		int TAM = 15;
		int[] A = new int[TAM];
		int[] B = new int[TAM];

		for (int i = 0; i < TAM; i++) {
			A[i] = i + 1;
		}
		for (int i = 0; i < TAM; i++) {
			B[i] = 1;
			for (int j = 1; j <= A[i]; j++) {
				B[i] *= j;
			}
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println("B[" + i + "] = " + B[i]);
		}
	}
}
