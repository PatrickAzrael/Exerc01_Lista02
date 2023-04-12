import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        /*
         * Nome do Aluno: Patrick Azrael Silva Carvalho
         * RA: 722313052
         * Nome do Programa: Faça um programa para a leitura de duas notas parciais de
         * um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
         * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
         * A mensagem "Reprovado", se a média for menor do que sete;
         * A mensagem "Aprovado com Distinção", se a média for igual a dez.
         * Data: 16/04/23
         */
        System.out.println("Informe sua primeira nota: ");
        Scanner leia = new Scanner(System.in);
        int nota1 = leia.nextInt();

        System.out.println("Informe a sua segunda nota: ");
        int nota2 = leia.nextInt();
        leia.close();
        int media = ((nota1 + nota2) / 2);

        if (media == 10) {
            System.out.printf("Você foi aprovado com distinção e a média alcançada foi [%d]", media);
        } else if (media >= 7) {
            System.out.printf("Você foi aprovado e a média alcançada foi [%d]", media);
        } else
            System.out.printf("Você foi reprovado e a média alcançada foi [%d]", media);
    }

}
