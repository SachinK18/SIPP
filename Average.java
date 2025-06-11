import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        double average = (numberOne + numberTwo + numberThree) / 3;
        System.out.println(average);
    }
}
