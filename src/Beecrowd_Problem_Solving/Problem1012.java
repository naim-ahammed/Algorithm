package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1012 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float A, B, C ;
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        double pi = 3.14159;

        double TRIANGULO = 0.000;
        TRIANGULO = (A*C)/2;

        double CIRCULO = 0.000;
        CIRCULO = pi*(C*C);

        double TRAPEZIO = 0.000;
        TRAPEZIO = ((A+B)*C)/2;

        double QUADRADO = 0.000;
        QUADRADO = (B*B);

        double RETANGULO = 0.000;
        RETANGULO = A*B;

        System.out.println("TRIANGULO: "+String.format("%.3f",TRIANGULO ));

        System.out.println("CIRCULO: "+String.format("%.3f",CIRCULO ));

        System.out.println("TRAPEZIO: "+String.format("%.3f",TRAPEZIO ));

        System.out.println("QUADRADO: "+String.format("%.3f",QUADRADO ));

        System.out.println("RETANGULO: "+String.format("%.3f",RETANGULO));



    }
}