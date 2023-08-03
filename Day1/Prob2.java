package Day1;

// Find max and min element in an array

import java.util.*;
public class Prob2{
    public static int find(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
             if(min >arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The minumum element of that array is : "+min);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i = 0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The maximum element int that array is : "+find(arr));
        sc.close();
    }
}