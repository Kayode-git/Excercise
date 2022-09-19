import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        int count = 0;

        while(count >= 0) {
            System.out.print("Enter guess number: ");
            int guess = input.nextInt();

            if (guess < number) {

                System.out.println("Too low");
            }

            if (guess > number) {
                System.out.println("Too high");
            }

            if (guess == number) {
                System.out.println("Perfect!!!");
                break;
            }
            count += 1;
        }
    }
}
