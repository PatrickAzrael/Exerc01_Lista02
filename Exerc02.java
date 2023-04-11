import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int num;
        num = leia.nextInt();
        leia.close();
        if (num > 0) {
            System.out.printf("O número informado é positivo e é [%d]", num);
        } else {
            System.out.printf(" O número informado é negativo e é [%d]", num);
        }

    }

}
