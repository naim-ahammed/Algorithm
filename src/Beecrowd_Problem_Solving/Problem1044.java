package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1044 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos"); // They are multiples
        } else {
            System.out.println("Nao sao Multiplos"); // They are not multiples
        }

//        int Multiplos = 0;
//
//        boolean c = a>b;
//        boolean d = b>a;

//        if (true){
//            if (a>b) {
//                Multiplos = a / b;

//            }
//            else if (b>a) {
//                Multiplos = b / a;
//                b%=a;
//                System.out.println("Nao Sao Multiplos");
//            }
//        }


//            if (c){
//                Multiplos = a / b;
//                if (true){
//                    a%=b;
//                    System.out.println("Nao Sao Multiplos");
//                }
//                else {
//
//                System.out.println("Sao Multiplos");
//                }
//
//            }
//             if (d) {
//                Multiplos = b / a;
//
//
//                if (true){
//                    b%=a;
//                    System.out.println("Nao Sao Multiplos");
//                }
//                else {
//                    System.out.println("Sao Multiplos");
//                }
//            }








    }}