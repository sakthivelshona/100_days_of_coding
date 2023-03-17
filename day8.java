Palindrome in String

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int a = A.length();
        String reverse="";
        for(int i=a-1;i>=0;--i){
            
            reverse = reverse + A.charAt(i);
        }        
        
        if(A.toLowerCase().equals(reverse.toLowerCase())){
            
            System.out.println("Yes");
        } 
            else{
              System.out.println("No");

            
        }
    }
}



