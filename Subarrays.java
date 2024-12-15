import java.util.*;
public class Subarrays {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        // calling 
        findSub(str, ans, 0);

    }
public static void findSub(String str ,String ans,int i){
    if(i==str.length()){
        if(ans.length()==0){
            System.err.println("{}");
        }else{
            System.out.print(ans);
            System.out.print(",");
        }
        return;
    }
    findSub(str, ans + str.charAt(i), i+1);
    findSub(str, ans, i+1);
}
    
}