package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1006 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float Aweight = 2.0f;
        float Bweight = 3.0f;
        float Cweight = 5.0f;

        double Multiply = 0.0;
        Multiply  = (A*Aweight)+(B*Bweight)+(C*Cweight);

        double sum = 0.0;
        sum = Aweight+Bweight;

        double average = (Multiply/sum)/2;

        System.out.println("MEDIA = "+String.format("%.1f",average));

    }
}

