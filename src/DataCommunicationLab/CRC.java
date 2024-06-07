package DataCommunicationLab;
import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data bit stream: ");
        String data = scanner.nextLine();

        System.out.print("Enter the polynomial bit stream: ");
        String div = scanner.nextLine();

        int datalen = data.length();
        int divlen = div.length();
        int len = datalen + divlen - 1;

        StringBuilder total = new StringBuilder(data);
        for (int i = datalen; i < len; i++) {
            total.append('0');
        }

        System.out.println("Data with appended zeros: " + total.toString());

        String remainder = check(data, div, total.toString(), datalen, divlen, len);

        total = new StringBuilder(data);
        total.append(remainder.substring(0, divlen - 1));

        System.out.println("Transmitted Code Word: " + total.toString());

        System.out.print("Enter the received code word: ");
        String received = scanner.nextLine();

        remainder = check(data, div, received, datalen, divlen, len);

        boolean error = false;
        for (int i = 0; i < divlen - 1; i++) {
            if (remainder.charAt(i) == '1') {
                error = true;
                break;
            }
        }

        if (error) {
            System.out.println("Received code word contains errors.");
        } else {
            System.out.println("Received code word is error-free.");
        }

        scanner.close();
    }

    private static String check(String data, String div, String total, int datalen, int divlen, int len) {
        char[] dataArray = new char[divlen];
        for (int j = 0; j < divlen; j++) {
            dataArray[j] = total.charAt(j);
        }

        for (int j = divlen; j <= len; j++) {
            if (dataArray[0] == '1') {

                for (int i = 1; i < divlen; i++) {
                    dataArray[i] = (dataArray[i] == div.charAt(i)) ? '0' : '1';
                }
            }

            for (int i = 0; i < divlen - 1; i++) {
                dataArray[i] = dataArray[i + 1];
            }
            if (j < total.length()) {
                dataArray[divlen - 1] = total.charAt(j);
            } else {
                dataArray[divlen - 1] = '0';
            }
        }

        return new String(dataArray);
    }
}
