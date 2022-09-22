public class ArraySum {
    public static void main(String[] args) {

        /* create an array "numbers"
        *  with element 2, 3, 6, 8, 4
        * initialise a variable "sum" to 0
        * for number in numbers, add number to "sum"
        * print out "sum"*/

        int[] numbers = {2, 3, 5, 6, 8, 4};

        int sum = 0;
        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

        System.out.printf("Sum = %d%n", sum);
    }
}
