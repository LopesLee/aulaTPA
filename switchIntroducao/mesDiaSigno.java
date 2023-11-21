package listaExercicios;
import java.util.Scanner;
public class mesDiaSigno {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mesNasc, diaNasc;
        System.out.println("Digite o mês de nascimento:");
        mesNasc = in.nextInt();
        System.out.println("Digite o dia do nascimento:");
        diaNasc = in.nextInt();
        switch (mesNasc){
            case 1:
            if(diaNasc>=1&&diaNasc<=20){
                System.out.println("Seu signo é capricornio");
            }else if(diaNasc>=20 && diaNasc<=31){
                System.out.println("Seu signo é aquario");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 2:
            if(diaNasc>=1 && diaNasc<=19){
                System.out.println("Seu signo é aquario");
            }else if(diaNasc>19 && diaNasc<=28){
                System.out.println("Seu signo é peixes");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 3:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo é peixes");
            }else if(diaNasc>20 && diaNasc<=31){
                System.out.println("Seu signo é aries");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 4:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo é aries");
            }else if(diaNasc>20 && diaNasc<=30){
                System.out.println("Seu signo é touro");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 5:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo é touro");
            }else if(diaNasc>20 && diaNasc<=31){
                System.out.println("Seu signo é gêmeos");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 6:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo é gêmeos");
            }else if(diaNasc>20 && diaNasc<=30){
                System.out.println("Seu signo é câncer");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 7:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo é câncer");
            }else if(diaNasc>21 && diaNasc<=31){
                System.out.println("Seu signo é leão");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 8:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo é leão");
            }else if(diaNasc>22 && diaNasc<=31){
                System.out.println("Seu signo é virgem");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 9:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo é virgem");
            }else if(diaNasc>22 && diaNasc<=30){
                System.out.println("Seu signo é libra");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 10:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo é libra");
            }else if(diaNasc>22 && diaNasc<=31){
                System.out.println("Seu signo é escorpião");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 11:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo é escorpião");
            }else if(diaNasc>21 && diaNasc<=30){
                System.out.println("Seu signo é sagitário");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 12:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo é sagitário");
            }else if(diaNasc>21 && diaNasc<=31){
                System.out.println("Seu signo é capricornio");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            default:
                System.out.println("Mês inválido");
        }
        
        in.close();
    }
}
