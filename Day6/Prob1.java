package Day6;

// Longest common prefix 


import java.util.*;

public class Prob1{

    public static int shortest(String[]strs){
        int ans = strs[0].length();
        int x = 0;

        for(int i = 0; i<strs.length-1;i++){
            if(strs[i].equals("")){
                return 0;
            }
            else{
                x = Math.min(strs[i].length(), strs[i+1].length());
                ans = Math.min(ans,x);
            }
        }
        return ans;
    }

    public static String longestCommonPrefix(String[]strs){

        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        int check = 0;
        int t = shortest(strs);
        System.out.println(t);
        if(t==0){
            return "";
        }
         if(strs.length==1){
            if(strs[0].equals("")){
                return"";
            }
            else{
            return sb.append(strs[0].charAt(0)).toString();
            }
        }
        else{
            while(t -- >0){
            if(check != idx){
                break;
            }
            else{
            int ctr = 1;
            ArrayList<Character>list = new ArrayList<>();
            for(int i = 0; i<strs.length;i++){
                char ch = strs[i].charAt(idx);
                list.add(ch);
                
            }
            for(int j = 0; j<list.size()-1;j++){
                if(list.get(j) == list.get(j+1)){
                    ctr++;
                }
                if(ctr == list.size()){
                    sb.append(list.get(0));
                    check++;
                }
               
            }
            idx++;
            
        }
    }
        
        if(sb.length() == 0){
            return "";
        }
        else{
            return sb.toString();
        }
    }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String strs [] = new String[size];

        for(int i= 0 ; i<size;i++){
            strs[i] = sc.next();
        }

        System.out.println(longestCommonPrefix(strs));

        sc.close();
    }
}