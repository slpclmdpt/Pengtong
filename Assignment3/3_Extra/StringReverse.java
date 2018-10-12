package Assignment3_Extra;

import java.util.Scanner;

// 1/1
// Total: 10/10
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string:");
		String s = sc.nextLine();
		System.out.println("After reverse:" + reverse(s));
	}

	public static String reverse(String s) {
		// Reverse all
		s = new StringBuffer(s).reverse().toString();
		//Recover the order of the inner of every word 
		String[] split=s.split(" ");
		String reversedString="";
		for(String temp:split) {
			temp=new StringBuffer(temp).reverse().toString();
				reversedString+=temp;
				if(!temp.equals(split[split.length-1])){
					reversedString+=" ";
				}
		}
		// Delete leading and trailing space
		reversedString = reversedString.trim();
		//Delete multiple spaces in the middle
		reversedString=reversedString.replaceAll(" +", " ");
		return reversedString;
	}
}
