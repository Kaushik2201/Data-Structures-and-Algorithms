package Day1;


// Check if String is Unique or not and even gives unique string if original string is not unique

import java.util.*;
public class Prob1{
    public static void check(String str) {
        //str = str.toLowerCase();
        //str = str.replaceAll("[^A-Za-z]+", "");
        System.out.println(str);
        boolean bool = true;
        StringBuilder sb = new StringBuilder();
        if(str.length()>128){
        bool = false;
        }
        else{
            boolean arr []= new boolean[128];
            for(int i = 0; i<str.length();i++){
                int val = str.charAt(i);
                if(arr[val]){
                    bool = false;
                }
                else{
                    bool = true;
                    arr[val]=true;
                }
                if(bool==true){
                    sb.append(str.charAt(i));
                }
            }
            if(sb.length()!=str.length()){
                bool = false;
            }
            System.out.println("Is this string unique - "+bool);
            System.out.println("The unique string will be - "+sb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        check(str);
        sc.close();
    }
}