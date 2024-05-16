//count number of consonents in a given string
import java.util.Scanner;

public class CountConsonents{
	// Method to count the number of consonants in a string
	public static int countConsonents(String str){
		int count = 0;
		// Handle case insensitivity
		str = str.toLowerCase();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			// (is character a letter)? and (is it not a vowel)?
			if((ch>='a' && ch<='z') && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		// Read String from user
		String str = scanner.nextLine();
		// Call countConsonents method
		System.out.println("The Consonent Count is: " + countConsonents(str));
	}
}