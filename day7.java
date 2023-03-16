Java substring Comparison

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
       
       smallest = largest= s.substring(0,k);
       
       for(int i=1;i<s.length()-k+1;i++){
           
           
           String str=s.substring(i,i+k);
           if(smallest.compareTo(str)>0)
           smallest=str;
           
           if(largest.compareTo(str)<0)
           largest=str;
           
       }
       
       
       
       
        return smallest + "\n" + largest;
    }

