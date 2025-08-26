public class array {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 4;
        numbers[3] = 9;
        numbers[4] = 16;
        numbers[5] = 25;
        numbers[6] = 36;
        numbers[7] = 49;
        numbers[8] = 64;
        numbers[9] = 81;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

