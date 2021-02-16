package GitHubCommit;

public class FindIfStringContainsAnotherSubString {
	
	public static int containsSubstring (String s1, String s2){
		
		for (int i=0;i<s2.length()-s1.length();i++){
			for (int j=0;j<s1.length();j++)
				if (s2.charAt(i+j) != s1.charAt(j))
					break;
				
			if (i == s1.length())
				return i;
		}
		
		return -1;
		
	}
	
	public static void main (String args[]){
		
		String s1 = "my";
		String s2 = "i love my country";
		
		int result = containsSubstring(s1,s2);
		System.out.println("Substring in the given String is at index " + result);
		
	}

}
