package exs15;

public class V_primoOuN�o {
	public static void main(String[] args) {
		// declarando vari�veis
		final int TAM = 10;
		int a[], i;
		a = new int[TAM];

		// criando la�os
		for (i = 0; i < TAM; i++) {
			a[i] = i + 1;
			// indentificando primos
			if (a[i] == 2) {
				System.out.println("Primo.");
			} else if (a[i] % 2 == 0) {
				System.out.println("Comum.");
			} else {
				System.out.println("Primo.");
			}
		}
	}
}
