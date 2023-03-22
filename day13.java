Java Tokens in String

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
StringTokenizer str = new StringTokenizer("He is a very very good boy, isn't he?");
int hi =str.countTokens();

System.out.println(hi);

        
String [] f = s.split("[ ,'?]+");

for (int i=0;i<f.length;i++){
    
    System.out.println(f[i]);
}

        scan.close();
    }
}

