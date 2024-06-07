package algoClass;

import java.util.Scanner;


public class AdjacencyMatrix {
    static int [][]matrix =new int [20][20];

    public static void main(String[] args) {
        int e=7, n=5;

        Inmatrix(e);
        System.out.println("output: ");

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static void Inmatrix(int e){
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the edges: ");

        int i;
        char j,k;

        for (i=0; i<e; i++){
            j=sn.next().charAt(0);
            k=sn.next().charAt(0);

            matrix[(int)j-65][(int) k-65]=matrix[(int) k-65][(int) j-65]=1;

        }
    }
}