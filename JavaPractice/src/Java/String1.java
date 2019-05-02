package Java;

import java.util.Scanner;

public class String1 {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String s= scn.nextLine();

		String s1= new String(s);

		
		char[] c= s.toCharArray();
		System.out.println(c);
		for(int i=0; i<s.length(); i++){
			System.out.println(c[i]);
			
		}
		
		char[] c11= s.toCharArray();
		for(int j=s.length()-1;j>0 ; j--){
			System.out.println(c11[j]);
		}
		
		System.out.println(c11);
		
		System.out.println("---------");
		for(int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		}
		for(int j=s.length()-1;j>0 ; j--){
			System.out.println(s.charAt(j));
		}
		
/*		for(int i=0; i<s2.length; i++){
			c1=s1.charAt(i);
			System.out.println("c1 = "+c1);
		}*/
		
	}

}
