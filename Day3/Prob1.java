package Day3;

// To check if the given string is a palindrome 

import java.util.*;
public class Prob1{
    public  static boolean  isPalindrome(String str){

        // Technique 1 using stack     

        Stack<Character>s = new Stack<>();
        for(int i = 0; i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return str.equals(sb.toString());
    }
    public  static boolean  isPalindrome2(String str){

        // Technique 2 using two pointer approach

        int start = 0;
        int end = str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        
        return true;
    }
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String a = "";

        for(int i = 0; i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                a+=str.charAt(i);
            }
        }

        a = a.toLowerCase();
        System.out.println("Technique 1 : "+isPalindrome(a));
        System.out.println("Technique 2 : "+isPalindrome2(a));
        sc.close();

    }
}
