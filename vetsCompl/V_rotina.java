package exs15;

import java.util.*;

public class V_rotina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int Tam = 10;
		int i, a[], x;
		a = new int[Tam];
		
		for (i = 0; i < Tam; i++) {
			System.out.println("Entre com o " + (i + 1) + " valor");
			a[i] = in.nextInt();
		}
		System.out.print("Digite o elemento que deseja buscar: ");
		x = in.nextInt();

		boolean ac = false;
		in.close();
		for (i = 0; i < Tam; i++) {
			if (a[i] == x) {
				ac = true;
				break;
			}
		}
		if (ac == true) {
			System.out.println("achou");
		} else {
			System.out.println("Nâo achou");

		}

	}
}
