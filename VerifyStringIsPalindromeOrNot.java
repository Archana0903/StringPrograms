package GitHubCommit;

public class VerifyStringIsPalindromeOrNot {
	
	public static void main (String args[]){
		
		String str = "atta";
		
		String revString = "";
		
		for (int i=str.length()-1;i>=0;i--){
			revString = revString + str.charAt(i);
		}
		
		System.out.println("Reversed String " + revString);
		if(revString.equals(str)){
			System.out.println("String is Palindrome");
		}
			else{
				System.out.println("String is not Palindrome");
			}
		}
			
	}
		
		
	


