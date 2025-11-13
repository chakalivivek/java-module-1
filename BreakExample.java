public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // exits the loop completely
            }

            System.out.println("i = " + i);
        }
    }
}
