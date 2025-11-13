
    import java.util.*;

public class CRC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input data bits
        System.out.print("Enter the size of the data array: ");
        int dataSize = scan.nextInt();
        int[] data = new int[dataSize];
        System.out.println("Enter data bits:");
        for (int i = 0; i < dataSize; i++) {
            System.out.print("Bit " + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }

        // Input divisor bits
        System.out.print("\nEnter the size of the divisor array: ");
        int divisorSize = scan.nextInt();
        int[] divisor = new int[divisorSize];
        System.out.println("Enter divisor bits:");
        for (int i = 0; i < divisorSize; i++) {
            System.out.print("Bit " + (i + 1) + ": ");
            divisor[i] = scan.nextInt();
        }

        // Divide data by divisor to get remainder
        int[] remainder = divideDataWithDivisor(data, divisor);

        // Display remainder
        System.out.print("\nRemainder (CRC bits): ");
        for (int i = 0; i < remainder.length - 1; i++) {
            System.out.print(remainder[i]);
        }

        // Generate final codeword
        System.out.print("\nGenerated CRC code: ");
        for (int bit : data) System.out.print(bit);
        for (int i = 0; i < remainder.length - 1; i++) System.out.print(remainder[i]);
        System.out.println();

        // Create data to send (original data + CRC)
        int[] sentData = new int[data.length + remainder.length - 1];
        System.arraycopy(data, 0, sentData, 0, data.length);
        System.arraycopy(remainder, 0, sentData, data.length, remainder.length - 1);

        // Simulate receiving data
        System.out.println("\nEnter received bits (" + sentData.length + " bits):");
        int[] receivedData = new int[sentData.length];
        for (int i = 0; i < sentData.length; i++) {
            System.out.print("Bit " + (i + 1) + ": ");
            receivedData[i] = scan.nextInt();
        }

        // Check for errors
        receiveData(receivedData, divisor);

        scan.close();
    }

    // Perform binary division
    static int[] divideDataWithDivisor(int[] oldData, int[] divisor) {
        int[] remainder = new int[divisor.length];
        int[] data = new int[oldData.length + divisor.length];

        System.arraycopy(oldData, 0, data, 0, oldData.length);
        System.arraycopy(data, 0, remainder, 0, divisor.length);

        for (int i = 0; i < oldData.length; i++) {
            if (remainder[0] == 1) {
                for (int j = 1; j < divisor.length; j++) {
                    remainder[j - 1] = exorOperation(remainder[j], divisor[j]);
                }
            } else {
                for (int j = 1; j < divisor.length; j++) {
                    remainder[j - 1] = exorOperation(remainder[j], 0);
                }
            }
            remainder[divisor.length - 1] = data[i + divisor.length];
        }
        return remainder;
    }

    // XOR operation
    static int exorOperation(int x, int y) {
        return (x == y) ? 0 : 1;
    }

    // Verify received data
    static void receiveData(int[] data, int[] divisor) {
        int[] remainder = divideDataWithDivisor(data, divisor);
        for (int bit : remainder) {
            if (bit != 0) {
                System.out.println("Corrupted data received!");
                return;
            }
        }
        System.out.println("Data received without any error.");
    }
}


