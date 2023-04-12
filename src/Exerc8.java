import java.util.Scanner;

public class Exerc8 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um programa que pergunte o preço de três produtos e
     * informe qual produto você deve comprar, sabendo que a decisão é sempre pelo
     * mais barato.
     * Data: 16/04/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // Produtos e valores
        System.out.println("Informe o nome do primeiro produto: ");
        String produto1 = leia.nextLine();

        System.out.println("Informe o nome do segundo produto: ");
        String produto2 = leia.nextLine();

        System.out.println("Informe o nome do terceiro produto: ");
        String produto3 = leia.nextLine();

        System.out.println("Informe o valor do primeiro produto: ");
        float valorp1 = leia.nextFloat();

        System.out.println("Informe o valor do segundo produto: ");
        float valorp2 = leia.nextFloat();

        System.out.println("Informe o valor do terceiro produto: ");
        float valorp3 = leia.nextFloat();

        leia.close();

        // Verificação do produto mais barato/acessível
        if (valorp1 < valorp2 && valorp1 < valorp3) {
            System.out.printf("O produto mais acessível é [%s] e o valor é [%f]", produto1, valorp1);
        } else if (valorp2 < valorp1 && valorp2 < valorp3) {
            System.out.printf("O produto mais acessível é [%s] e o valor é [%f]", produto2, valorp2);
        } else {
            System.out.printf("O produto mais acessível é [%s] e o valor é [%f]", produto3, valorp3);
        }
    }
}
