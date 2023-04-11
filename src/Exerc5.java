import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
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
