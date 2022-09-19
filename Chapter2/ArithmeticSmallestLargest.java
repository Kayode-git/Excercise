package Chapter2;

public class ArithmeticSmallestLargest {
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int product(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }


    public int smallest(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public int largest(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
