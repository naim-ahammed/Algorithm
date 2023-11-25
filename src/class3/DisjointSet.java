package class3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DisjointSet {

    public static void arrylop(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void arry(){
        int[] myArray= new int[5];
        myArray[0]=5;
        myArray[1]=3;
        myArray[2]=4;
        myArray[3]=8;
        myArray[4]=1;

        Arrays.sort(myArray);
        arrylop(myArray);

        arrylop(new int[]{Arrays.binarySearch(myArray, 4)});

        int[] a = new int[]{Arrays.binarySearch(myArray, 5)};
        System.out.println(Arrays.toString(a));

        arrylop(myArray);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int[] s1 = {1,2,3,4};
        int[] s2 = {5,6,7,8};

        System.out.println("s1 :"+s1.length);
        System.out.println("s1 :"+Arrays.toString(s1));

        System.out.println("s2 :"+s2.length);
        System.out.println("s2 :"+s2);
//-------------------------------------
        int[] s3 = {5,6,7,8,10,2,1,4,3,9};
        Arrays.sort(s3);
        System.out.println("s3 :"+ Arrays.toString(s3));
//---------------------------------------------
        int[][] s4 = new int[2][3];
        s4[0][0]=1;
        System.out.println("s4 :"+ Arrays.deepToString(s4));
//-----------------------------------------------
        int[][] s5 = {{1,2,3,4},{5,6,7,8}};
        System.out.println("s5 :"+ Arrays.deepToString(s5));

//-----------------------------------------------
        DisjointSet.arry();
        //-----------------------------------------------






    }


    }

