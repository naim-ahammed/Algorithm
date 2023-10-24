package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1018 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int A = 100;
        int B = 50;
        int C = 20;
        int D = 10;
        int E = 5;
        int F = 2;
        int G = 1;

        int x ;
        x = (N/A);
        System.out.println(x+" nota(s) de R$ 100,00");
        N%=A;

        int x2= (N/B);
        System.out.println(x2+" nota(s) de R$ 50,00");
        N%=B;

        int x4= (N/C);
        System.out.println(x4+" nota(s) de R$ 20,00");

        N%=C;
        int x6= (N/D);
        System.out.println(x6+" nota(s) de R$ 10,00");

        N%=D;
        int x8= (N/E);
        System.out.println(x8+" nota(s) de R$ 5,00");

        N%=E;
        int x10= (N/F);
        System.out.println(x10+" nota(s) de R$ 2,00");

        N%=F;
        int x12= (N/G);
        System.out.println(x12+" nota(s) de R$ 1,00");
        sc.close();



//        int x = (N/A);
//        System.out.println(x+" nota(s) de R$ "+A+",00");
//
//        int x1=(N%=A);  //76-50=26
//        int x2= (x1/B);
//        System.out.println(x2+" nota(s) de R$ "+B+",00");
//
//        int x3=(N%=B);  //26-20=6
//        int x4= (x3/C);
//        System.out.println(x4+" nota(s) de R$ "+C+",00");
//
//        int x5=(N%=C);  //6-10=-4
//        int x6= (x5/D);
//        System.out.println(x6+" nota(s) de R$ "+D+",00");
//
//        int x7=(N%=D);  //
//        int x8= (x7/E);
//        System.out.println(x8+" nota(s) de R$ "+E+",00");
//
//        int x9=(N%=E);  //
//        int x10= (x9/F);
//        System.out.println(x10+" nota(s) de R$ "+F+",00");
//
//        int x11=(N%=F);  //
//        int x12= (x11/G);
//        System.out.println(x12+" nota(s) de R$ "+G+",00");

    }
}