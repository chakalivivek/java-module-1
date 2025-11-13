public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number = -5; // You can change this value to test different cases
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
    }
}