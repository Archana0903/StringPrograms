package GitHubCommit;

public class ExtractCharacterFromString {
	
	public static String ExtractString (String str){
		
		str = str.replaceAll("[*^\\d]", " ");
		str.trim();
		
		str = str.replaceAll(" +", " ");
		if (str.equals(""))
			return "-1";
		
		return str;
	}
	
	public static void main (String args[]){
		
		String str = "776576GJJGJG&%&^%gjguytgu";
		System.out.println(ExtractString(str));
		
	}

}
