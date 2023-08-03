package Day2;

// Maximum number of tasks a person can do at a time

import java.util.*;
public class Prob1{
    public static void main(String[] args) {
        
        // Input of arrays 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int start [] = new int[size];
        int end [] = new int[size];

        for(int i = 0; i<size;i++){
            start[i] = sc.nextInt();
        }

        for(int i = 0; i<size;i++){
            end[i] = sc.nextInt();
        }

        int jobs [][] = new int[size][3];
        for(int i = 0; i<size;i++){
            jobs[i][0] = i;   // Storing the original indices
            jobs[i][1] = start[i];    // Storing corresponding start and end time
            jobs[i][2] = end[i];
        }

        // Sorting based on end time
        java.util.Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));

        // Creating an ArrayList to store indices
        ArrayList<Integer>list = new ArrayList<>();
        list.add(jobs[0][0]);  // First element will be there

        int idx = 0;

        for(int i = 1;i<size;i++){
            // From next idx
            if(jobs[idx][2]<=jobs[i][1]){
                list.add(jobs[i][0]);
                idx++;
            }
        }

        System.out.println("The Maximum Number of task that can be done are : "+list.size());

        System.out.println("Those task are : "+list.toString());

        sc.close();




    }
}