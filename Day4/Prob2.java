package Day4;

import java.util.*;

// Chocolate problem

public class Prob2{

    // Func to calculate the minimum difference
    public static int minDiff(int arr[], int m){

        // Sorting the array 
        java.util.Arrays.sort(arr);

        // Finding the comparisons 
        int comparisons = (arr.length -m ) +1;

        // Taking the first comparision as ans (Assuming)
        int ans = arr[m-1] - arr[0];

        // Now checking if any other value is possible 
        // Starting frm 1 as comparision 0 is already assumed 
        for(int i = 1; i<comparisons;i++){
            int x = arr[i+m-1] - arr[i];
            ans = Math.min(ans, x);   // If any other value exist
        }

        return ans;  // Final ans 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];

        // Input of array
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();   // No of Chocolates 

        System.out.println("The minimum difference between tallest and shortest chocolate packet is : "+minDiff(arr, m));
        sc.close();
    }
}