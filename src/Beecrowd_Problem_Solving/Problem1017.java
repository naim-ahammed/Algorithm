package Beecrowd_Problem_Solving;


import java.io.IOException;
import java.util.*;

public class Problem1017 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double trip = 12.000;
        int spentTime   = sc.nextInt();
        int averageSpeed  = sc.nextInt() ;

        double speed = 0.000;
        speed = (averageSpeed/trip)*spentTime;

        System.out.println(String.format("%.3f",speed));
    }
}