package exs15;
import java.util.*;
public class V_decrescente {
	 public static void main(String[] args) {
	        
		    int TAM = 10;
	        int[] A = new int[TAM];
	        int[] B = new int[TAM];
	        int[] C = new int[TAM];

	        Scanner in = new Scanner(System.in);

	        
	        System.out.println("Digite os 10 elementos do vetor A:");
	        for (int i = 0; i < TAM; i++) {
	            A[i] = in.nextInt();
	            in.close();
	        }

	        
	        for (int i = 0; i < TAM; i++) {
	            B[i] = A[i];
	            C[i] = A[i];
	        }

	        
	        for (int i = 0; i < TAM - 1; i++) {
	            for (int j = 0; j < TAM - 1 - i; j++) {
	                if (B[j] > B[j + 1]) {
	                    int t = B[j];
	                    B[j] = B[j + 1];
	                    B[j + 1] = t;
	                }
	            }
	        }

	        
	        for (int i = 0; i < TAM - 1; i++) {
	            for (int j = 0; j < TAM - 1 - i; j++) {
	                if (C[j] < C[j + 1]) {
	                    int t = C[j];
	                    C[j] = C[j + 1];
	                    C[j + 1] = t;
	                }
	            }
	        }

	        
	        System.out.println("Vetor B (crescente):");
	        for (int i = 0; i < TAM; i++) {
	            System.out.print(B[i] + " ");
	        }

	        System.out.println("\nVetor C (decrescente):");
	        for (int i = 0; i < TAM; i++) {
	            System.out.print(C[i] + " ");
	        }
	    }
}
