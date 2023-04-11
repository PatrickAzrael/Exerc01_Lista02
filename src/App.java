import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1;
        num1 = leia.nextInt();

        System.out.println("Informe outro número: ");
        int num2;
        num2 = leia.nextInt();
        leia.close();
        if (num1 > num2) {
            System.out.printf("O maior número informadoo foi [%d]", num1);
        } else {
            System.out.printf("O maior número informado foi [%d]", num2);
        }

    }
}