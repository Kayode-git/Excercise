package Chapter2;

public class CrapMain {
    public static void main(String[] args) {

        Craps craps = new Craps();
        craps.rollDice();

        System.out.printf("You roll: %d%n", craps.sumOfDice);

        if(craps.getStatus() == Craps.Status.WON) {
            System.out.println("You Won!!");
        }

        if(craps.getStatus() == Craps.Status.LOST) {
            System.out.println("You Lost");
        }

        if(craps.getStatus() == Craps.Status.CONTINUE) {
            System.out.printf("Your point is: %s%n", craps.myPoint);
            System.out.println("Continue");
        }


        while(craps.gameStatus == Craps.Status.CONTINUE) {
            craps.rollDice();

            if(craps.sumOfDice == craps.myPoint) {
                System.out.printf("%nYou roll: %d%n", craps.sumOfDice);
                System.out.println("You Won!!");
                break;
            }

            if(craps.sumOfDice ==  7) {
                System.out.printf("%nYou roll: %d%n", craps.sumOfDice);
                System.out.println("You Lost");
                break;
            }

            else {
                System.out.printf("%nYou roll: %d%n", craps.sumOfDice);
                System.out.println("Continue");
                craps.gameStatus = Craps.Status.CONTINUE;
                }

        }
    }
}
