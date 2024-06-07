package DataCommunicationLab;

public class ChecksumTransmitter {

    public static void main(String[] args) {
        String cellNumber = "01784788447";

        int totalDigits = cellNumber.length();

        String codeword = Integer.toBinaryString(totalDigits);

        String polynomial = "1110";

        int checksumLength = polynomial.length() - 1;
        String paddedCodeword = codeword + "0".repeat(checksumLength);

        String checksum = calculateChecksum(paddedCodeword, polynomial);

        String transmittedCodeword = codeword + checksum;

        System.out.println("Original Codeword: " + codeword);
        System.out.println("Polynomial: " + polynomial);
        System.out.println("Checksum: " + checksum);
        System.out.println("Transmitted Codeword with Checksum: " + transmittedCodeword);
    }

    public static String calculateChecksum(String codeword, String polynomial) {
        int codewordLength = codeword.length();
        int polynomialLength = polynomial.length();

        int[] codewordBits = new int[codewordLength];
        int[] polynomialBits = new int[polynomialLength];

        for (int i = 0; i < codewordLength; i++) {
            codewordBits[i] = Character.getNumericValue(codeword.charAt(i));
        }
        for (int i = 0; i < polynomialLength; i++) {
            polynomialBits[i] = Character.getNumericValue(polynomial.charAt(i));
        }

        for (int i = 0; i < codewordLength - (polynomialLength - 1); i++) {
            if (codewordBits[i] == 1) {
                for (int j = 0; j < polynomialLength; j++) {
                    codewordBits[i + j] ^= polynomialBits[j];
                }
            }
        }

        StringBuilder checksum = new StringBuilder();
        for (int i = codewordLength - (polynomialLength - 1); i < codewordLength; i++) {
            checksum.append(codewordBits[i]);
        }

        return checksum.toString();
    }
}
