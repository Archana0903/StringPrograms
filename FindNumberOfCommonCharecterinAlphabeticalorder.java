package GitHubCommit;

public class FindNumberOfCommonCharecterinAlphabeticalorder {
	
	public static void commonChar(String s1, String s2){
		
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		
		for (int i=0;i<s1.length();i++)
			a1[s1.charAt(i) - 'a'] += 1;
		
		for (int i=0;i<s2.length();i++)
			a2[s2.charAt(i) - 'a'] += 1;
		
		for (int i=0;i<26;i++)
			if (a1[i] !=0 && a2[i] != 0){
				
				for (int j=0;j<Math.min(a1[i], a2[i]);j++){
					System.out.println(((char)(i+ 'a')));
				}
			}
		
	}
	
	public static void main (String args[]){
		String s1 = "morgan";
		String s2 = "stanley";
		
		commonChar(s1,s2);
		
	}

}
