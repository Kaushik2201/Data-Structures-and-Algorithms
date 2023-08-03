package Day2;

// Find the minimum sum of 2 numbers by using all numbers of that array

import java.util.*;

public class prob3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr [] = new int[size];

        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        java.util.Arrays.sort(arr);

        int sum = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int tuttle = 0;
        int hare = 1;
      
        while(tuttle!=size && hare!= size){
           sb1.append(""+arr[tuttle]);
           sb2.append(""+arr[hare]);
            tuttle+=2;
            hare+=2; 
        }

        if(size%2 != 0){
            sb1.append(""+arr[size-1]);
        }

        sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());

        System.out.println("The minimum sum of two numbers formed by all the elements of the array is : "+sum);

        sc.close();
    }
}
