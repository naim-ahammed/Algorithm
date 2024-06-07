package algoClass;

import java.util.Arrays;
    public class MergeSortSwapping {

            private long swapCount = 0;

            void merge(int arr[], int left, int mid, int right) {
                int l = mid - left + 1;
                int r = right - mid;

                int leftArray[] = new int[l];
                int rightArray[] = new int[r];

                for (int i = 0; i < l; ++i) {
                    leftArray[i] = arr[left + i];
                }

                for (int j = 0; j < r; ++j) {
                    rightArray[j] = arr[mid + 1 + j];
                }

                int i = 0, j = 0;
                int k = left;
                while (i < l && j < r) {
                    // Change the condition for descending order
                    if (leftArray[i] >= rightArray[j]) {
                        arr[k] = leftArray[i];
                        i++;
                    } else {
                        arr[k] = rightArray[j];
                        j++;
                        // Increment the swap count when a swap occurs
                        swapCount += (mid - left + 1) - i;
                    }
                    k++;
                }
                while (i < l) {
                    arr[k] = leftArray[i];
                    i++;
                    k++;
                }

                while (j < r) {
                    arr[k] = rightArray[j];
                    j++;
                    k++;
                }
            }

            void sort(int arr[], int left, int right) {
                if (left < right) {
                    int mid = (left + right) / 2;
                    sort(arr, left, mid);
                    sort(arr, mid + 1, right);
                    merge(arr, left, mid, right);
                }
            }

            public static void main(String args[]) {
                int arr[] = {7 , 5, 3, 1};
                MergeSortSwapping ob = new MergeSortSwapping();
                ob.sort(arr, 0, arr.length - 1);

                // Printing the output
                System.out.println("Sorted array in descending order");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + "");
                }

                // Printing the number of swaps
                System.out.println("Number of swaps: " + ob.swapCount);
            }
        }


