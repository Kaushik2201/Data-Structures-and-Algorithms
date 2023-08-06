package Day4;

// To reverse an array 

import java.util.*;
public class Prob3{

    public static int[] reverse(int arr[]){
        
        // Function to reverse it using temp variable 
        for(int i = 0; i<arr.length/2;i++){
            // Exchange two numbers without using the third 
            
            arr[i] = arr[i] + arr[arr.length-1-i];   // x = x + y
            
            arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];     // y = x - y
            
            arr[i] = arr[i] - arr[arr.length-1-i];      // x = x - y

        }
        return  arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr [] = new int[size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    
        sc.close();
    }

}