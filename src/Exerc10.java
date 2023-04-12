import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        /*
         * Nome do Aluno: Patrick Azrael Silva Carvalho
         * RA: 722313052
         * Nome do Programa: Faça um Programa que pergunte em que turno você estuda.
         * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
         * mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!",
         * conforme o caso.
         * Data: 16/04/23
         */
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o turno em que você estuda M(Matutino), V(Vespertino) ou N(Noturno): ");
        char letra = leia.next().charAt(0);

        leia.close();

        if (letra == 'M') {
            System.out.println("Bom dia!");
        } else if (letra == 'V') {
            System.out.println("Boa tarde!");
        } else if (letra == 'N') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido");
        }

    }
}
