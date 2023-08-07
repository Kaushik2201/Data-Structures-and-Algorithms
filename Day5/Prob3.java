package Day5;

import java.util.Scanner;

// Remove duplicate characters in the string 

public class Prob3{

    public static String removeConsecutiveCharacter(String S){

        int size = S.length();
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));

        for(int i = 0; i<size-1;i++){
            if(S.charAt(i) != S.charAt(i+1)){
                sb.append(S.charAt(i+1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(removeConsecutiveCharacter(S));

        sc.close();
    }
}