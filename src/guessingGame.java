import java.util.Scanner;

public class guessingGame {
    public static int generateRandomNumber() {
        return (int)(Math.random() * 100);
    }
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhação. Adivinhe o número de 1 a 100");
        int randomNumber = generateRandomNumber();

        int numberChosen = 0;

        while (numberChosen != randomNumber) {
            System.out.println("Escolha um número");
            Scanner sc = new Scanner(System.in);
            numberChosen = sc.nextInt();


            if (numberChosen < randomNumber) {
                System.out.println("Mais!");
            }

            if (numberChosen > randomNumber) {
                System.out.println("Menos!");
            }
        }

        System.out.println("Acertou!");
    };
}
