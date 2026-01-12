package seleniumDemo;

import java.util.Scanner;

public class testing {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
//int newNum = num;
//int reverse = 0;
//while(num!=0) {
//	int lastDigit = num%10;
//	reverse = reverse*10 + lastDigit;
//	num/=10;
//}
//  
//  if(newNum == reverse) {
//	  System.out.println("it is palindrome");
//	  
//  }
//  else {
//	  System.out.println("it is not palindrome");
//  }
//int count = 0;
//
//while(num!=0) {
//	
//	num/=10;
//	count++;
//}
// 
//while(newNum!=0) {
//	int lastDigit = newNum%10;
//	 System.out.println(Math.pow(lastDigit, counlknt));
//	
//	
//}

//
// int[][] arr = new int[num][num];
// 
// for(int i=0;i<arr.length;i++) {
//	 for(int j=0;j<arr.length;j++) {
//		  arr[i][j]= sc.nextInt(); 
//	 }
// }
//	
// int sum =0;
//  
// for(int i=0;i<arr.length;i++) {
//	 for(int j=0;j<arr.length;j++) {
//		  sum+=arr[i][j]; 
//	 }
// }  
//	 double avg = 0.0;
// for(int i=0;i<arr.length;i++) {
//	 for(int j=0;j<arr.length;j++) {
//		  avg = sum/arr.length;
//	 }
// }  
// }
//int max = arr[0];
//for(int i=0;i<arr.length;i++) {
//	if(max<arr[i]) {
//		max = arr[i];
//	}
//}
//System.out.println(sum);
//System.out.println(avg);
	  
	String n1 = "Ashish";
	String s = "ashish";
	StringBuffer s1 = new StringBuffer("hello");
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("A"));
		System.out.println(s.endsWith("sh"));
		
	}
	System.out.println(s.length());
	System.out.println(s.equals(n1));
	System.out.println(s.equalsIgnoreCase(n1));
	System.out.println(s.indexOf("s"));
	System.out.println(s.concat(n1));
	System.out.println(s.trim());
	System.out.println(s.substring(2,5));
	System.out.println(s.lastIndexOf("a"));
	System.out.println(s1.capacity());
	
	System.out.println(s1.reverse());
	
	
	
}
}
