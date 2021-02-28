package GitHubCommit;

public class FindLongestStringInGivenStrings {
	
	public static String findLongestString(String[] str){
		
		int maxlength = 0;
		String longestString = null;
		
		for (String s : str){
			if (s.length() > maxlength){
				maxlength = s.length();
				longestString = s;
			}
		}
		return longestString;
		
	}
	
	public static void main (String args[]){
		
		String[] strings = {"java", "Selenium", "GitHub", "javacode"};
		System.out.println(findLongestString(strings));
		
	}

}
