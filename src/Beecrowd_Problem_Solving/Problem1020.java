package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1020 {
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();

        int year = 365;

        int day = 30;

        int a = x/year;

        x%=year;

        int b=x;
        int c = b/day;

        x%=day;

        System.out.println(a+" ano(s)");

        System.out.println(c+" mes(es)");

        System.out.println(x+" dia(s)");
    }
}