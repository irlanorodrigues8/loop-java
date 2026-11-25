
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vamos contar de 0 a 10? ");
        String res = scanner.nextLine();
        if ((res.equalsIgnoreCase("sim")) || (res.equalsIgnoreCase("ok"))) {
            int contador = 0;
            while (contador <= 10) {
                System.out.println(contador);
                contador = contador + 1;
            }
        }
        System.out.println("vamos contar de 10 ate 0 agora?");
        String res1 = scanner.nextLine();
        if ((res1.equalsIgnoreCase("sim")) || (res1.equalsIgnoreCase("ok"))) {
            int contador1 = 10;
            while (contador1 >= 0) {
                System.out.println(contador1);
                contador1 = contador1 - 1;
            }
        }
        System.out.println("agora é a sua vez, quer tentar? ");
        String res2 = scanner.nextLine();
        if ((res2.equalsIgnoreCase("sim")) || (res2.equalsIgnoreCase("ok"))) {
            int contador3 = 0;
            System.out.println("você gostaria de contar ate que número? ");
            int res3 = scanner.nextInt();
            while (contador3 <= res3) {
                System.out.println(contador3);
                contador3 = contador3 + 1;
            }

        }

    }
}
