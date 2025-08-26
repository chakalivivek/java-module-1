import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            sum += sc.nextInt();
        }

        double average = (double) sum / n;
        System.out.println("The average is: " + average);
    }
}