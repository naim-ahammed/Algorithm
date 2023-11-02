package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1037 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        double x7 = 0.000;
        double x = 25.0000;
        double x1 = 25.00001;
        double x2 = 50.0000000;
        double x3 = 50.00000001;
        double x4 = 75.0000000000;
        double x5 = 75.00000000001;
        double x6 = 100.0000000000000;

        if(a < 0 || a > 100){
            System.out.println("Fora de intervalo");
        }
        if(a>=x7 && a<=x){
            System.out.println("Intervalo "+"[0,25]");
        }

        if(a>x1 && a<=x2){
            System.out.println("Intervalo "+"(25,50]");
        }

        if(a>x3 && a<=x4){
            System.out.println("Intervalo "+"(50,75]");
        }

        if(a>x5 && a<=x6){
            System.out.println("Intervalo "+"(75,100]");
        }
//        else {
//
//
////            System.out.println("intervalo ")
//        }


    }
}