package listaComplementar;

public class IntersecçãoVet {
	public static void main(String[] args) {
        int TAM = 10;
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
        int[] C = new int[TAM];

        int tC = 0;
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    C[tC] = A[i];
                    tC++;
                    break;
                }
            }
        }
        System.out.println("Vetor C (Interseção):");
        for (int i = 0; i < tC; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}

