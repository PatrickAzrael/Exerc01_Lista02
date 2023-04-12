import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        /*
         * Nome do Aluno: Patrick Azrael Silva Carvalho
         * RA: 722313052
         * Nome do Programa: Faça um Programa que leia três números e mostre-os em ordem
         * decrescente.
         * Data: 16/04/23
         */

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = leia.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = leia.nextInt();

        System.out.println("Informe o terceiro número: ");
        int num3 = leia.nextInt();

        leia.close();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num1, num2, num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num1, num3, num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num2, num1, num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num2, num3, num1);
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num3, num2, num1);
        } else {
            System.out.printf("A ordem decrescente é [%d], [%d], [%d]", num3, num1, num2);
        }

    }

}
