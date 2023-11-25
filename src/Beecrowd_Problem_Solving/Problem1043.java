package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1043 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if(a+b>c && a+c>b && b+c>a){
            float Perimetro = a+b+c;
            System.out.println("Perimetro = "+Perimetro);
        }
        else {
            float trapezium  = ((a+b)*c)/2;
            System.out.println( "Area = " + trapezium );
        }

    }}
