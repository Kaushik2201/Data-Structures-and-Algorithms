package Day6;

import java.util.*;

// Print all the duplicate elememts 

public class Prob2{

    public static String duplicate(String str){

        char chararray [] = str.toCharArray();
        
        int count = 1;
        
        java.util.Arrays.sort(chararray);
        
        str = new String(chararray);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length()-1;i++){
           if(str.charAt(i) == str.charAt(i+1)){
               count++;
            if(!sb.toString().contains(""+str.charAt(i))){
                sb.append(str.charAt(i));
            }
           }
           else {
            if(count>1){
                sb.append(count);
            }
            count = 1;
           }
        }
        if(count>1){
            sb.append(count);
            }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(duplicate(str));
        
        sc.close();
    }
}