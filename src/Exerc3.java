import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        /*
         * Nome do Aluno: Patrick Azrael Silva Carvalho
         * RA: 722313052
         * Nome do Programa: Faça um Programa que verifique se uma letra digitada é "F"
         * ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo
         * Inválido.
         * Data: 16/04/23
         */
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe uma letra (F ou M): ");
        char letra = leia.next().charAt(0);

        leia.close();

        if (letra == 'F') {
            System.out.println("Você é do sexo Feminno");
        } else if (letra == 'M') {
            System.out.println("Você é do sexo Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

    }

}
