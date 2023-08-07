package Day5;

// Reverse a queue till first k elements 

import java.util.*;
public class Prob1{

// Function to reverse the elements which returns the nodified queue

public static Queue<Integer> modify(Queue<Integer> q, int k){

    // Creating an Array to store the elements to be swapped 
    int n = q.size();
   int arr [] = new int[n];

    int compare = k/2;

    for(int i = 0; i<n;i++){
       arr[i] = q.remove();
    }

    for(int i = 0; i<compare;i++){
       arr[i] = arr[i] + arr[k-1-i];
       arr[k-1-i] = arr[i] - arr[k-1-i];
       arr[i] = arr[i] - arr[k-1-i];
    }

    for(int i = 0; i<arr.length;i++){
       q.add(arr[i]);
    }

    return q;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int k = sc.nextInt();

    Queue<Integer>q = new LinkedList<>();

    for(int i = 0; i<size;i++){
        q.add(sc.nextInt());
    }

    System.out.println(modify(q, k).toString());
    sc.close();
}

}