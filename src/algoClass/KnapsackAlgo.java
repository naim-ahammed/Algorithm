package algoClass;

public class KnapsackAlgo {

    private int numOfItems;
    private int capacityOfKnapsack;
    private int[][] knapsackTable;
    private int totalBenefit;
    private int[] weigths;
    private int[] values;

    public KnapsackAlgo(int numOfItems, int capacityOfKnapsack, int[] weigths, int[] values){

        this.numOfItems = numOfItems;
        this.capacityOfKnapsack = capacityOfKnapsack;
        this.weigths = weigths;
        this.values = values;
        this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
    }

    public void solve(){

        // Initialize base case
        for (int w = 0; w <= capacityOfKnapsack; w++) {
            knapsackTable[0][w] = 0;
        }

        for (int i = 1; i <= numOfItems; i++) {
            for (int w = 0; w <= capacityOfKnapsack; w++) {
                int notTakingItem = knapsackTable[i - 1][w];
                int takingItem = 0;

                if (weigths[i] <= w) {
                    takingItem = values[i] + knapsackTable[i - 1][w - weigths[i]];
                }
                knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
            }
        }
        totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
    }

    public int getTotalBenefit() {
        return totalBenefit;
    }

    public static void main(String[] args) {
        int numOfItems = 3;
        int capacityOfKnapsack = 5;
        int[] weights = {4, 2, 3};
        int[] values = {10, 4, 7};

        KnapsackAlgo knapsack = new KnapsackAlgo(numOfItems, capacityOfKnapsack, weights, values);
        knapsack.solve();

        System.out.println("Total Benefit: " + knapsack.getTotalBenefit());
    }


}
