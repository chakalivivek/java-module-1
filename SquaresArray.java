public class SquaresArray {
    public static void main(String[] args) {
        int[] squares = new int[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        System.out.println("Squares of numbers 1 to 10 are:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square of " + (i + 1) + " = " + squares[i]);
        }
    }
}