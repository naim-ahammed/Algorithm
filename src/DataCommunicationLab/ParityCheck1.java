package DataCommunicationLab;


import java.util.Scanner;

public class ParityCheck1 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System. in);

        System.out.println("Enter the bit stream: ");

        String bitStream = scanner. nextLine();

        int lastDigit = 0;

        String parityType = (lastDigit % 2 == 0)? "even" : "odd";

        int numOnes = countOnes(bitStream);

        if (parityType. equals("even")) {

            if (numOnes % 2 == 0) {
                System.out.println("No error detected (odd parity)");
            } else {
                System.out.println("Error detected (odd parity)");

            }

        } else {

            if (numOnes % 2 == 1) {
                System.out.println("No error detected (odd parity)");
            } else {
                System.out.println("Error detected (odd parity)");
            }

        }

        scanner.close();

    }

    static int countOnes(String bitStream) {

        int count = 0;

        for (char bit : bitStream. toCharArray()) {

            if (bit == '1') {

                count++;

            }

        }

        return count;

    }

}
