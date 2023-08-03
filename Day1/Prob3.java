package Day1;

// Check if array contains any duplicate 

import java.util.*;
public class Prob3{
    public static boolean check(int arr []) {
        boolean bool = false;
        for(int i =0; i<arr.length-2;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    bool = true;
                }
            }
        }
       
        return bool;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i = 0; i<size;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(check(arr));
        sc.close();
    }
}