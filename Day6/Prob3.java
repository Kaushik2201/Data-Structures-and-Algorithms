package Day6;

// Longest substring without repeate 

import java.util.*;

public class Prob3{

    public  static int lengthOfLongestSubstring(String s){

        if(s.length() == 0){
            return 1;
        }

        if(Character.isWhitespace(s.charAt(0))){
            return 1;
        }


        int ans = 0;
        int count = 1;
        ArrayList<Character>list = new ArrayList<>();
        list.add(s.charAt(0));

        for(int i =1; i<s.length();i++){
             if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                count++;
            }
            else{
                ans = Math.max(ans, count);
                list.clear();
                list.add(s.charAt(i));
                count = 1;
            }
        }
        return ans;
    }

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }
}