package javatest2;

import java.util.Scanner;

/*
 遞迴方法

「遞迴」（Recursion）是在方法中呼叫自身同名方法，而呼叫者本身會先被置入記憶體「堆疊」（Stack）中，
等到被呼叫者執行完畢之後，再從堆疊中取出之前被置入的方法繼續執行。堆疊是一種「先進後出」（First in, last out）
的資料結構，就好比您將書本置入箱中，最先放入的書會最後才取出。 Java 支援遞迴，遞迴的實際應用很多，舉個例子來說，
求最大公因數就可以使用遞迴來求解
 5 
 */

public class UseRecursion {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("輸入兩數:"); 
	        System.out.print("m = "); 
	        int m = scanner.nextInt();

	        System.out.print("n = "); 
	        int n = scanner.nextInt();

	        System.out.println("GCD: " + gcd(m, n)); 
	    } 
	  
	  
	  	//輾轉相除法
	    private static int gcd(int m, int n) { 
	        if(n == 0) 
	            return m; 
	        else 
	            return gcd(n, m % n); 
	    } 

}
