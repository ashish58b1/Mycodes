package Java;

public class String2 {

	public static void main(String[] args) {
		
		String s= "ashish srivastava";
		String[]s1= s.split(" ");
		for(int i=0; i<s1.length; i++){
			System.out.println("----");
			System.out.println(s1[i]);
			
		}
		
		int n= s.indexOf('s');
		System.out.println(n);
		if(n!=-1){
			int n1= s.indexOf('s', n+1);
			if(n1!=-1)
			System.out.println(n1);
			else System.out.println("only one character is there inside given string");
			if(n1!=-1) {
				int n2= s.indexOf('s', n1+1);
				System.out.println(n2);
			}
		}
		
	

	}

}
