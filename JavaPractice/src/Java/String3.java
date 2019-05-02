package Java;

public class String3 {

	public static void main(String[] args) {
	
		String s= "java";
		String s2="";
		char c;
		for(int i=0; i<s.length(); i++) {
			c=s.charAt(i);
			if(s2.indexOf(c)==-1) {
				s2+=c;
			}
		}System.out.println(s2);
		
		int n[]= {1,2,3,99,3,6,22,4,100};
		int big=0;
		for(int i=0; i<n.length; i++) {
			if(n[i]>big)big=n[i];
		}
		System.out.println("The biggest number is "+big);

	}

}
