package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1005 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();

        float Aweight = 3.5f;
        float Bweight = 7.5f;

        double Multiply = 0.0;
        Multiply  = (A*Aweight)+(B*Bweight);

        double sum = 0.0;
        sum = Aweight+Bweight;

        double average = (Multiply/sum);

        System.out.println("MEDIA = "+String.format("%.5f",average));

    }
}
