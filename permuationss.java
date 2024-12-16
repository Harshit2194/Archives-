// n! for permutations for n=3  then  3*2*1 = 6 = 3!
//time complexity is due to loop n and for ever element is n!
//T.C+ (N* N !)
//import java.util.*;
public class permuationss{
    public static void findPer(String str ,String ans){
        //bc
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for( int i=0;i<str.length();i++){
            char character = str.charAt(i);
            String newstring= str.substring(0,i) + str.substring(i+1);
            findPer(newstring, ans + character);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        String ans ="";
        findPer(str, "");
    }

    }
