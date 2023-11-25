package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1035 {
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();



        if ((B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();

    }
}

//        int sum1 = c+d;
//        int sum2 = a+b;
//
//        if (b>c){
////            System.out.println("Valores aceitos");
//                     if (d>a){
////            System.out.println("Valores aceitos");
//                                  if (sum1>sum2){
//                             //sum of C and D >  sum of A and B
////            System.out.println("Valores aceitos");
//                                               if (c > 0){
//                                          // positives value
////            System.out.println("Valores aceitos");
//                                                   if (d > 0){
//                                                       // positives value
////            System.out.println("Valores aceitos");
//
//                                                       if (a % 2 == 0){
//                                                           // A is even
////            System.out.println("Valores aceitos");
//                                                       }}}}}
//            System.out.println("Valores aceitos");
//        }