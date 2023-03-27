Java Subarray

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array1= new int[n];
    for(int i=0;i<n;i++){
        array1[i]=sc.nextInt();
    }
    int count=0;
    for(int j=0;j<n;j++){
        int sum=0;
        for(int k=j;k<n;k++){
            sum=array1[k]+sum;
            if(sum<0){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}



Java Inheritance I


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    
    void sing(){
        System.out.println("I am singing");
    }
    
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}
