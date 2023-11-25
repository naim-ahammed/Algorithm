package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1009 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); ;

        Double sellersSalary = sc.nextDouble();
        Double totalValueSold = sc.nextDouble();

        Double TOTAL = 0.00;
        TOTAL = sellersSalary+(totalValueSold * 0.15f);


        System.out.println("TOTAL = R$ "+String.format("%.2f",TOTAL));

    }
}