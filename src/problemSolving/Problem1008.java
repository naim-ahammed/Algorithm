package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1008 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int NUMBER = sc.nextInt();
        int A = sc.nextInt();
        float B = sc.nextFloat();

        float SALARY = 0.00f;
        SALARY = A * B;

        System.out.println("NUMBER = "+NUMBER);
        System.out.println("SALARY = U$ "+String.format("%.2f",SALARY));

    }
}