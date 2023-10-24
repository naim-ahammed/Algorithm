package problemSolving;

import java.io.IOException;
import java.util.*;

public class Problem1019 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int hours = N/3600;
        N%=3600;
        int minutes = N/60;
        int seconds = N%60;


       System.out.println(hours+":"+minutes+":"+seconds);


//        int minute ;
//        minute = N%=minutes;
//
//        if (seconds>minutes)
//        {
//            System.out.println(seconds);
//        }
//        if (seconds<minute){
//            System.out.println(minute);
//        }













//        int hour ;
//        hour = N/=hours;

//        System.out.println(seconds+":"+minute+":"+hour);

    }
}