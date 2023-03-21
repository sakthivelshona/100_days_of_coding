Java Anagram

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

a=a.toLowerCase();
b=b.toLowerCase();

if(a.length()==b.length()){
    
    int []x=new int[256];
    int []y=new int[256];
    
    for(int i=0;i<a.length();i++){
       
        
        x[(int) a.charAt(i)] += 1;
        y[(int) b.charAt(i)] += 1;

    }
    
    for(int i=0;i<256;i++){
        
        
        if(x[i]!=y[i])
            
            return false;
        
        
    }
    return true;
    
    
}

else{
    
    return false;
    
}
}


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
