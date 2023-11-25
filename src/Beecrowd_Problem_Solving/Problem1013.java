package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1013 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int abs = sc.nextInt();

        int maiorAB=0;
        maiorAB = (a+b+abs*(a-b))/2;


        if(a >= b && a >= abs){
            System.out.println(a+" eh o maior");
        }
        if (b >= a && b >= abs){
            System.out.println(b+" eh o maior");
        }
        if (abs >= a && abs >= b){
            System.out.println(abs+" eh o maior");
        }

    }
}
//    Scanner scanner = new Scanner(System.in);
//
//    // Read three integer values from the user
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//
//    // Find the greatest value among the three
//    int greatest = Math.max(a, Math.max(b, c));
//
//// Print the greatest value and the message
//        System.out.println(greatest + " eh o maior");