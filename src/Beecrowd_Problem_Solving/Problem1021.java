package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1021 {
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);

        double x= sc.nextFloat();


       double a= 100.00;
       double b= 50.00;
       double c= 20.00;
       double d= 10.00;
       double e= 5.00;
       double f= 2.00;

        double m= 1.00;
        double n= 0.50;
        double o= 0.25;
        double p= 0.10;
        double q= 0.05;
        double r= 0.01;

        System.out.println("NOTAS:");

        double g= (double) (x/a);
        System.out.println((int)g+" nota(s) de R$ 100.00");
        x%=a;

        double h= (x/b);
        System.out.println((int)h+" nota(s) de R$ 50.00");
        x%=b;

        double i= (x/c);
        System.out.println((int)i+" nota(s) de R$ 20.00");
        x%=c;

        double j= (x/d);
        System.out.println((int)j+" nota(s) de R$ 10.00");
        x%=d;

        double k= (x/e);
        System.out.println((int)k+" nota(s) de R$ 5.00");
        x%=e;

        double l= (x/f);
        System.out.println((int)l+" nota(s) de R$ 2.00");



        //////////////////////////////
        System.out.println("MOEDAS:");

        double s1= (x/m);
        System.out.println((int)s1+" moeda(s) de R$ 1.00");
        x%=m;

        double s2= (x/n);
        System.out.println((int)s2+" moeda(s) de R$ 0.50");
        x%=n;

        double s3= (x/o);
        System.out.println((int)s3+" moeda(s) de R$ 0.25");
        x%=o;

        double s4= (x/p);
        System.out.println((int)s4+" moeda(s) de R$ 0.10");
        x%=p;

        double s5= (x/q);
        System.out.println((int)s5+" moeda(s) de R$ 0.05");
        double x1 = x %q;

        double s6=  (x1/r);

        System.out.println((int)s6+" moeda(s) de R$ 0.01 "+x1);


    }
}
/////Math.ceil(s6+s7)+