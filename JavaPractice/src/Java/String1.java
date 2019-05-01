package Java;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String s= scn.nextLine();
		String[] s2 = new String[] {s};
		String s1= new String(s);
		
		char c1;
		
		char[] c= s.toCharArray();
		System.out.println(c);
		for(int i=0; i<s.length(); i++){
			System.out.println(c[i]);
		}
		
		for(int i=0; i<s2.length; i++){
			c1=s1.charAt(i);
			System.out.println("c1 = "+c1);
		}
		
	}

}
