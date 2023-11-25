package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1007 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA = 0;
        DIFERENCA =  (A * B) - (C * D);

        System.out.println("DIFERENCA = "+DIFERENCA);

    }
}