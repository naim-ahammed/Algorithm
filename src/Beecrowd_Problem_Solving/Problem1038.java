package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1038 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==1){
            float  R$ = y * 4.00f;
            System.out.println("Total: R$ "+ String.format("%.2f",R$));
        }
        if (2==x){
            float  R$ = y * 4.50f;
            System.out.println("Total: R$ "+ String.format("%.2f",R$));

        }
        if (3==x){
            float  R$ = y * 5.00f;
            System.out.println("Total: R$ "+ String.format("%.2f",R$));

        }
        if (4==x){
            float  R$ = y * 2.00f;
            System.out.println("Total: R$ "+ String.format("%.2f",R$));

        }
        if (5==x){
            float  R$ = y * 1.50f;
            System.out.println("Total: R$ "+ String.format("%.2f",R$));

        }


    }
}