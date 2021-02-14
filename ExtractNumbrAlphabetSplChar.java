package GitHubCommit;

public class ExtractNumbrAlphabetSplChar {
	
	public static void extractFromString (String str){
		
		StringBuffer alpha = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		StringBuffer splchar = new StringBuffer();
		
		for (int i=0;i<str.length();i++){
			if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			
			else if (Character.isDigit(str.charAt(i)))
				digit.append(str.charAt(i));
			
			else
				splchar.append(str.charAt(i));
		}
		
		System.out.println("Alphabets in given String are : " + alpha);
		System.out.println("Numeric value in given String are : " + digit);
		System.out.println("Special Character in given String are : " + splchar);
	}
	
	public static void main (String args[]){
		String str = "67896$%@$Arch6456ana79087%^#%";
		extractFromString(str);
		
	}
	
	
	
}
