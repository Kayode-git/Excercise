package Chapter2;

public class ComparingInteger {
    public String compareInteger(int number) {
        if(number < 100) {
            return "less than 100";
        }
        if(number > 100) {
            return "greater than 100";
        }
        else {
            return "equal to 100";
        }

    }

    public String compareSquareInteger(int number) {
        if(number * number < 100) {
            return "less than 100";
        }
        if(number * number > 100) {
            return "greater than 100";
        }
        else {
            return "equal to 100";
        }
    }
}
