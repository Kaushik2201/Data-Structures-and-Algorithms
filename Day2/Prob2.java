package Day2;

import java.util.*;

// Minimum number of notes / coins need to be given of certain value

public class Prob2{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        Integer curren [] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        int idx = 0; 

        java.util.Arrays.sort(curren, Collections.reverseOrder());   // Sorting in descending order

        ArrayList<Integer>list = new ArrayList<>();

        while(val!=0){

            if(val>=curren[idx]){
                list.add(curren[idx]);
                val -= curren[idx];
            }
            else{
                idx++;
            }
        }

        System.out.println("The minimun number of notes/coins are : "+list.size());
        System.out.println("The notes/coins are : "+list.toString());

        sc.close();

    }
}