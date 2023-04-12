import java.util.Scanner;

public class Exerc7 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um Programa que leia três números e mostre o maior e o
     * menor deles.
     * Data: 16/04/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1 = leia.nextInt();

        System.out.println("Informe outro número: ");
        int num2 = leia.nextInt();

        System.out.println("Informe mais um número: ");
        int num3 = leia.nextInt();
        leia.close();
        if (num1 > num2 && num1 > num3) {
            System.out.printf("O número informado foi [%d] e é o maior dos números informados", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("O número informado foi [%d] e é o maior dos números informados", num2);
        } else {
            System.out.printf("O número informado foi [%d] e é o maior dos números informados", num3);
        }

        System.out.println("");

        if (num1 < num2 && num1 < 3) {
            System.out.printf("O número informado foi [%d] e é o menor dos números informados", num1);
        } else if (num2 < num1 && num2 < num3)
            System.out.printf("O número informado foi [%d] e é o menor dos números informados", num2);
        else {
            System.out.printf("O número informado foi [%d] e é o menor dos números informados", num3);
        }
    }
}
