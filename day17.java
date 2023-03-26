Java BigInteger

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            
        Scanner p = new Scanner(System.in);
        BigInteger a = new BigInteger(p.next());
        BigInteger b = new BigInteger(p.next());
        
    
        BigInteger c = a.add(b);    
        BigInteger d = a.multiply(b);    
        
        System.out.println(c);
        System.out.println(d);

        
    }
}
