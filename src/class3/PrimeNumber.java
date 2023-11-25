package class3;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

//    public static void printArray(int[] numbers){
//
//        for (int i=0; i<numbers.length; i++){
//                System.out.println(numbers[i]+" ");
//            }
//    }
//
//    public static void arrayShorting(){
//        Scanner sc = new Scanner(System.in);
//
////        int[] arr = new int[3];
////        arr[0] = sc.nextInt();
////        arr[1] = sc.nextInt();
////        arr[2] = sc.nextInt();
////
////        System.out.println(arr[0]+"\n"+""+arr[1]+"\n"+""+arr[2]+"\n");
////
////        Arrays.sort(arr);
////        printArray(arr);
//
//
//    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Create an array to store the original order
        int[] originalOrder = {a, b, c};

        // Sort the integers in ascending order
        Arrays.sort(originalOrder);

        // Print the sorted numbers
        for (int number : originalOrder) {
            System.out.println(number);
        }

        // Print a blank line
        System.out.println();

        // Print the original order of the numbers
        for (int number : new int[]{a, b, c}) {
            System.out.println(number);
        }

//        PrimeNumber.arrayShorting();


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();



        }
//        int n1 = arry.length;
//        for (int i1=0; i1<n1; i1++){
//            System.out.println(arry[i1]);
//        }

    }

