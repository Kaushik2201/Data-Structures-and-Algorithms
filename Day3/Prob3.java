package Day3;

// Valid parantheses

import java.util.*;
public class Prob3{
    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();

        // If its an opening bracket push it into the stack
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);

            }
            else{
                // Checking in the stack if its not an opening bracket
                // If stack is empty no opening bracket starts with closing bracket its invalid
                if(s.isEmpty()){
                    return false;
                }

                // Now if opening and closing bracket has a pair then remove that opening bracket
                if((s.peek()=='(' && ch == ')' )
                || (s.peek() =='{' && ch == '}')
                || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }

                // if anyother thing is not true
                else{
                    return false;
                }
            }
        }

        // Now after traversing the whole string we found that the stack was empty - Valid condition
        if(s.isEmpty()){
            return true;
        }

        // If stack has some brackets left - Invalid condition
        else{
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isValid(str));

        sc.close();
        
    }
}