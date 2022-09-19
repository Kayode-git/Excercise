package Chapter2;

import java.security.SecureRandom;

public class Craps {

    public int sumOfDice;
    public int nextSumOfDice;
    public int myPoint;
    public Status gameStatus;

    public enum Status {CONTINUE, WON, LOST}
    private final SecureRandom randomNumber = new SecureRandom();


    public void rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        sumOfDice = die1 + die2;
    }

    public Status getStatus() {

        switch(sumOfDice) {
            case 7, 11 -> gameStatus = Status.WON;
            case 2, 3, 12 -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
            }
        }

        if(gameStatus == Status.CONTINUE) {

            if (nextSumOfDice == myPoint) {
                gameStatus = Status.WON;
            }
            if (nextSumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }

        return gameStatus;
    }


}
