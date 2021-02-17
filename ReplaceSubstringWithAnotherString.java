package GitHubCommit;

public class ReplaceSubstringWithAnotherString {
	
	public static void main (String args[]){
		
		String actualString = "i love my country";
		String tobereplaced = "country";
		String replacewith = "india";
		
		StringBuffer sb = new StringBuffer();
		String[] toreplace = actualString.split(tobereplaced);
		
		for (int i=0;i<=toreplace.length-1;i++){
			sb = sb.append(toreplace[i]);
			
			if (i != toreplace.length-1);
			sb = sb.append(replacewith);
		}
		
		System.out.println("New String after replaceing the substring >>-- " + sb);
	}

}
