package GitHubCommit;

public class FindUniqueCharecterInAString {
	
	public static void main (String args[]){
		
		String s = "banana is a good food";
		String s1 = "";
		
		for (int i=0;i<s.length();i++){
			if (s1.indexOf(s.charAt(i)) == -1){
				s1 = s1 + s.charAt(i) + " ";
			}
		}
		System.out.println("Common Characters in given Strings are " + s1);
	}

}
