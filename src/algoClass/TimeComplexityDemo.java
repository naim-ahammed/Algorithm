package algoClass;

public class TimeComplexityDemo {

    public static void main(String[] args) {

        double currentTimeMillis = System.currentTimeMillis();

        TimeComplexityDemo timeComplexityDemo = new TimeComplexityDemo();

//       int var =  timeComplexityDemo.findSum(99999);
//       System.out.println(var);
        System.out.println(timeComplexityDemo.findSum(99999));

        System.out.println("time Complexity = "+ (System.currentTimeMillis() - currentTimeMillis)+ " Milliseconds.");
    }

//    public int findSum(int n){
//        return n*(n-1)/2;
//    }
//
    public int findSum(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum = sum + i;
        }
     return sum;
    }
}
