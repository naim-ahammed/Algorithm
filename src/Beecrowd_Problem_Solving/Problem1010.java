package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1010 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int code1, units1 = sc.nextInt();
        float price1 = sc.nextFloat();

        int code2, units2 = sc.nextInt();
        float price2 = sc.nextFloat();

        double VALOR = 0;
        VALOR = (units2*price2)+(units1*price1);

        System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",VALOR));

    }
}