package Beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.*;

public class Problem1040 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float average = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);

        System.out.println("Media: " + String.format("%.1f", average));

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double examScore = sc.nextDouble();
            System.out.println("Nota do exame: " + String.format("%.1f", examScore));
            double finalAverage = (average + examScore) / 2;
            System.out.println(finalAverage >= 5.0 ? "Aluno aprovado." : "Aluno reprovado.");
            System.out.println("Media final: " + String.format("%.1f", finalAverage));
        }

//        Scanner sc = new Scanner(System.in);
//
//        double n1 = sc.nextDouble();
//        double n2 = sc.nextDouble();
//        double n3 = sc.nextDouble();
//        double n4 = sc.nextDouble();
//
//        double average  = (n1*2+n2*3+n3*4+n4*1)/(2+3+4+1);
//
//        System.out.println("Media: "+ String.format("%.1f",average ));
//
//        if (average >=7.0){
//            System.out.println("Aluno aprovado.");
//        }
//        if (average <5){
//            System.out.println("Aluno reprovado.");
//        }
//
//        if (average>5 && average<=6.9){
//            System.out.println("Aluno em exame.");
//
//
//            float garvage = sc.nextFloat();
//            System.out.println("Nota do exame: "+garvage);
//            if (average>5 || average<=4.9){
//                System.out.println("Aluno aprovado.");
//                double averageFinal = (average+garvage)/2;
//                System.out.println("Media final: "+String.format("%.1f",averageFinal));
//            }
//        }


    }
}
