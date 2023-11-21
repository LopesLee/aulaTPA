public class AnoBissex {
    public static void main(String[] args) {
        int i;
        
        for (i=1;i<=2023;i++) {
            if ((i% 4 == 0 && i% 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " é um ano bissexto");
            }
        }
    }
}
