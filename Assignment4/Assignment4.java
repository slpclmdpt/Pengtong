package Assignmen4;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Assignment4 assignment4 = new Assignment4();
		// test of firstUniqueChar
		System.out.println("------------Find Unique Char---------------");
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		assignment4.firstUniqChar(str);
		// test of addDigits
		System.out.println("------------------Add Digits---------------");
		System.out.println("Enter a integer:");
		int num = sc.nextInt();
		int num1 = assignment4.addDigits(num);
		System.out.printf("The final digit is %d\n", num1);
		// test of moveZeroes
		System.out.println("------------------Move zeroes--------------");
		System.out.println("Enter the length of your array:");
		int[] nums = new int[sc.nextInt()];
		System.out.println("Enter the array:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		assignment4.moveZeroes(nums);
		// test of find longest palindrome substring
		System.out.println("-----Find longest palidromic substring-----");
		System.out.println("Enter a string:");
		String s = sc.next();
		assignment4.longestPalindrome(s);
		// test of rotate an n*n array
		System.out.println("--------------Rotate array-----------------");
		System.out.println("Enter an integer n as the n*n array's dimension:");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		assignment4.rotate(arr);
	}

	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST. Please feel free to
	 * contact Zane and Amanda for any questions.
	 */

	/*
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1. s = "leetcode" return 0. s =
	 * "loveleetcode" return 2.
	 */
	public int firstUniqChar(String s) {
		// TODO
		// LinkedHashMap to store the chars,values of the map are counters of every
		// char.
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] c1 = s.toCharArray();
		for (char letter : c1) {
			if (map.containsKey(letter)) {
				map.replace(letter, map.get(letter) + 1);
			} else {
				map.put(letter, 1);
			}
		}
		char firstUnique = ' ';
		boolean exist = false;
		// check the counter of every char and record the first char whose counter
		// bigger than 1
		for (Entry<Character, Integer> kvpir : map.entrySet()) {
			if (kvpir.getValue() == 1) {
				firstUnique = kvpir.getKey();
				exist = true;
				break;
			}
		}
		// String has a unique char
		if (exist) {
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] == firstUnique) {
					System.out.printf("The first unique letter's index is:%d.\n", i);
					return i;
				}
			}
		}
		// String doesn't have a unique char
		System.out.println("The first unique letter doesn't exist.");
		return -1;
	}

	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit. Input: 38 Output: 2 Explanation: The process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		// TODO
		if (n < 10) {
			return n;
		}
		int sum = n;
		while (sum >= 10) {
			int temp = 0;
			// devide sum to single digit
			String str = String.valueOf(sum);
			char[] c1 = str.toCharArray();
			// calculate the current sum
			for (int i = 0; i < c1.length; i++) {
				temp += c1[i] - 48;
			}
			sum = temp;
		}
		return sum;
	}

	/*
	 * Given an array nums, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements. Input: [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 */
	public void moveZeroes(int[] nums) {
		// TODO
		int[] temp = new int[nums.length];
		for (int i = 0, j = 0, count = 0; count < nums.length; count++) {
			if (nums[count] != 0) {
				temp[i] = nums[count];
				i++;
			} else {
				temp[nums.length - 1 - j] = 0;
				j++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.printf(temp[i] + " ");
		}
		System.out.println();
	}

	/*
	 * Given a string s, find the longest palindromic substring in s. You may assume
	 * that the maximum length of s is 1000. Input: "babad" Output: "bab" Note:
	 * "aba" is also a valid answer.
	 */
	public String longestPalindrome(String s) {
		// TODO
		char[] c = s.toCharArray();
		int maxLength = 0;
		boolean exist = false;
		String longest = new String();
		// control the first char of string
		for (int i = 0; i < s.length(); i++) {
			// control the length of substring
			for (int j = 1; j <= s.length() - i; j++) {
				// copy the given length of substring and check whether it is palindromic
				char[] temp = new char[j];
				for (int k = 0; k < j; k++) {
					temp[k] = c[i + k];
				}
				if (isParlindrome(temp)) {
					exist = true;
					if (temp.length > maxLength) {
						maxLength = temp.length;
						longest = String.valueOf(temp);
					}
				}
			}
		}
		if (exist) {
			System.out.println("The longest palindromic substring is:" + longest);
			return longest;
		} else {
			System.out.println("There is no palindromic substring in the given string.");
			return " ";
		}
	}

	public boolean isParlindrome(char[] c) {
		StringBuilder sb = new StringBuilder(String.valueOf(c));
		return (String.valueOf(c).equals(sb.reverse().toString()));
	}

	/*
	 * You are given an n x n 2D matrix representing an image. Rotate the image by
	 * 90 degrees (clockwise). Given input matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
	 * rotate the input matrix in-place such that it becomes: [ [7,4,1], [8,5,2],
	 * [9,6,3] ],
	 */
	public int[][] rotate(int[][] matrix) {
		// TODO
		int[][] arr = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = matrix[arr.length - j - 1][i];
			}
		}
		System.out.println("After rotating:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

}
