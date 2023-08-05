package Day3;

// Valid Anagram

import java.util.*;
public class Prob2{
    public static boolean isAnagram(String s , String t){

        char CharArray[] = s.toCharArray();
        char CharArray2 [] = t.toCharArray();

        java.util.Arrays.sort(CharArray);
        java.util.Arrays.sort(CharArray2);

        s = new String(CharArray);
        t = new String(CharArray2);

        return s.equals(t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(isAnagram(s, t));

        sc.close();

    }
}
