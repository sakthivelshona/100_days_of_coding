Java primality test

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger c = new BigInteger(n);
        
        System.out.println(c.isProbablePrime(10)?"prime":"not prime");

        
        bufferedReader.close();
    }
}

