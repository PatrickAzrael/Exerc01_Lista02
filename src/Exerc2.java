import java.util.Scanner;

public class Exerc2 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um Programa que peça um valor e mostre na tela se o
     * valor é positivo ou negativo.
     * Data: 16/04/23
     */
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
