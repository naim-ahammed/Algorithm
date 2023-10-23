package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1011 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;
        double VOLUME =0;

        VOLUME = 1.33333333333333333*pi*(R*R*R);

        System.out.println("VOLUME = "+String.format("%.3f",VOLUME ));


    }
}