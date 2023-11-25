package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;
import static java.lang.Math.sqrt;

public class Problem1036 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double pr1 = (b * b) - (4 * a * c);

        if (pr1 < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double bhaskara_formula = (-b + sqrt(pr1)) / (2 * a);
            double bhaskara_formula2 = (-b - sqrt(pr1)) / (2 * a);
            System.out.println("R1 = " + String.format("%.5f", bhaskara_formula));
            System.out.println("R2 = " + String.format("%.5f", bhaskara_formula2));
        }
    }
}