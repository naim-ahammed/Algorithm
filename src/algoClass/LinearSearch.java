package algoClass;

public class LinearSearch {

    public static int linearSearch(int[] array, int n){

        for (int i = 0; i < array.length; i++) {

            if (array[i]==n){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int n = 4;
        System.out.println(linearSearch(array,n));

    }

}
