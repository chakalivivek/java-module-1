public class CountArray {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 57, 72};
        int count = 0;

        for (int number : numbers) {
            if (number > 50) {
                count++;
            }
        }

        System.out.println("The numbers greater than 50: " + count);
    }
}