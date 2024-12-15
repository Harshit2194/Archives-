import java.lang.reflect.Array;
import java.util.*;
public class maxGuestMeet {
    public static int primeTime(int arr[],int dep[],int n ){
        
        int i =1 , j = 0 , curr = 1 , res = 1;
        
        while (i < n && j < n) { 
            if (arr[i]<dep[j]) {
                curr++;
                i++;
            }else{
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        // arrival time in arrival array 8:30 as 830 simliarly for deperature time; 
        // result is metting max guests in min time;
        int arrival[]={800,700,600,500};
        int depature[]={840,820,830,530};
        Arrays.sort(arrival);
        Arrays.sort(depature);
        // n is the number of arrivals which is equal to the guests in and out;
        int n = arrival.length;
        System.out.println(primeTime(arrival,depature,n));
    }
    
}
