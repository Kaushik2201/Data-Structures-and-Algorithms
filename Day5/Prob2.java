package Day5;

// Reverse the entire queue

import java.util.*;
public class Prob2{

    public static Queue<Integer> reverse(Queue<Integer>q){

        // Creating an array to store the queue elements 
        int arr[] = new int[q.size()];

        for(int i = arr.length-1; i>=0;i--){
            arr[i] = q.remove();
        }
        for(int i = 0; i<arr.length;i++){
            q.add(arr[i]);
        }
        return q;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue <Integer> q = new LinkedList<>();

        for(int i = 0; i<size;i++){
            q.add(sc.nextInt());
        }

        System.out.println(reverse(q).toString());
        sc.close();
    }
}