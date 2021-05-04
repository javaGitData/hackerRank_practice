//hacker rank challenge - 1
/*STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output

3

Explanation

https://s3.amazonaws.com/hr-challenge-images/25168/1474122392-c7b9097430-sock.png

There are three pairs of socks.
*/

package com.corejava.SalesbyMatch_1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    	String str = "";
    	Integer count = 0;
    	List<Integer> cnt =new ArrayList();
      
        System.out.println("inserted num of list::"+ar);
        Collections.sort(ar);
        System.out.println("sorted numbers of list:::"+ar);
        Set<Integer> distinctNum = new HashSet<Integer>(ar);
        for(Integer i :distinctNum) {
        
        System.out.println(i+" inserted "+Collections.frequency(ar, i) +" times");
        
        count = Collections.frequency(ar, i);  
        cnt.add(count);
        }//for
        System.out.println("list of number of time inserted elements::"+cnt);
        int quient=0;
        int totalPairs = 0;
        for(Integer c :cnt) {
            
            if(c>=2) {
                quient=c/2;
                System.out.println("pairs:"+quient);
                totalPairs = totalPairs + quient;
            }//if
    }//for
        System.out.println("total number of Pairs are::"+totalPairs);
		return totalPairs;
    
    

}//method
}//class


public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter numbers of index::");
    	int n = sc.nextInt();
      // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       
      //  int n = Integer.parseInt(bufferedReader.readLine().trim());
       
       /* List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
       */
    	List<Integer> ar =new ArrayList<Integer>();
    	
    	for(int i=1;i<=n;i++) {
    		System.out.println("enter array num:"+ i );
    		int num = sc.nextInt();
    		ar.add(num);
    		
    	}
        int result = Result.sockMerchant(n, ar);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
	}
}

//2nd solution without calling method as direct writting in main method
/*package com.corejava.practice;

import java.awt.Paint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class QuotientAndRemainder {
	  
    public static void main(String[] args)
    {
    	String str = "";
    	Integer count = 0;
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter numbers of index::");
    	int n = sc.nextInt();
        
    	List<Integer> l =new ArrayList<Integer>();
    	List<Integer> cnt =new ArrayList();
    	for(int i=1;i<=n;i++) {
    		System.out.println("enter array num:"+ i );
    		int num = sc.nextInt();
    		l.add(num);
    		
    	}
    	System.out.println("inserted num of list::"+l);
    	Collections.sort(l);
    	System.out.println("sorted numbers of list:::"+l);
    	Set<Integer> distinctNum = new HashSet<Integer>(l);
    	for(Integer i :distinctNum) {
    	
    	System.out.println(i+"inserted "+Collections.frequency(l, i) +"times");
    	
    	count = Collections.frequency(l, i);  
    	cnt.add(count);
    	}
    	System.out.println("list of number of time inserted elements::"+cnt);
    	int quient=0;
    	int totalPairs = 0;
    	for(Integer c :cnt) {
    		
    		if(c>=2) {
    			quient=c/2;
    			System.out.println("pairs:"+quient);
    			totalPairs = totalPairs + quient;
    		}
    }
    	System.out.println("total number of Pairs are::"+totalPairs);
       
    }
}*/

