package listaExercicios;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		int a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a idade do aluno.");
		a = in.nextInt();

		switch(a) {
			case 6:
				System.out.println("Aluno categoria dente de leite.");
				break;
			case 7:
				System.out.println("Aluno categoria júnior.");
				break;
			case 8:
				System.out.println("Aluno categoria júnior max.");
				break;
			case 9:
				System.out.println("Aluno categoria júnior master.");
				break;
			case 10:
				System.out.println("Aluno categoria master.");
				break;
				default:
					System.out.println("Os alunos da Escola/clube tem de 6 a 10 anos de idade,");
					System.out.println("Certifique-se de que tenha preenchido o campo com a idade correta do aluno.");
					
					}
		in.close();
		}
}
