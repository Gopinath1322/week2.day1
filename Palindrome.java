package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String input="madam";
		String rev="";
		for (int i = input.length()-1; i >=0; i--) {
			rev = rev+input.charAt(i);
			
			
		}
		if(rev.equals(input))
		System.out.println("given word is palindrome");
		else
			System.out.println("given word is not palindrome");
	}

}
