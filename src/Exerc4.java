import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        System.out.println("Informe uma letra[minúscula]: ");
        Scanner leia = new Scanner(System.in);
        char letra = leia.next().charAt(0);

        leia.close();

        if (letra == 'a') {
            System.out.printf("A letra [%c] informada é uma vogal", letra);
        } else if (letra == 'e') {
            System.out.printf("A letra [%c] informada é uma vogal", letra);
        } else if (letra == 'i') {
            System.out.printf("A letra [%c] informada é uma vogal", letra);
        } else if (letra == 'o') {
            System.out.printf("A letra [%c] informada é uma vogal", letra);
        } else if (letra == 'u') {
            System.out.printf("A letra [%c] informada é uma vogal", letra);
        } else {
            System.out.printf("A letra [%c] informada é uma consoante", letra);
        }
    }
}
