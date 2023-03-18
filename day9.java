Today I have solved 2 problems

1) String Introduction

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int z = A.length();    
        int y = B.length();
        
        int x = z+y;
        System.out.println(x);

        
        if (A.compareTo(B)>0){
                    System.out.println("Yes");

        }
        
        else{
            System.out.println("No");

        }
        System.out.println(A.substring(0,1).toUpperCase() +A.substring(1,A.length())+ " "+B.substring(0,1).toUpperCase() +B.substring(1,B.length()));

        
        
        
    }
}


2)Substring

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String a=S.substring(start,end);
    System.out.println(a);
    
    }
}


