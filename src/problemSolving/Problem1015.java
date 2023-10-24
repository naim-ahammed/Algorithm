package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1015 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        double Distance =0;
        Distance =Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        System.out.println(String.format("%.4f",Distance));
    }
}