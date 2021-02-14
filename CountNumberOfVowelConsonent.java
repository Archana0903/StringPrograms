package GitHubCommit;

public class CountNumberOfVowelConsonent {
	
	public static void  main (String args[]){
		
		String str = "archanasingh";
		
		int vcount = 0;
		int ccount = 0;
		
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vcount++;
			}
				
				else if(ch >= 'a' && ch <= 'z'){
					ccount++;
				
			}
		}
		
		System.out.println("Count of Vowel = " + vcount);
		System.out.println("Count of Consonent = " + ccount);
	}

}
