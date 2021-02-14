package GitHubCommit;

public class GenerateAllRotationForGivenString {
	
	public static void rotateString (String str){
		
		StringBuffer sb = new StringBuffer(str);
		sb.append(str);
		
		for (int i=0;i<str.length();i++){
			for (int j=0;j<str.length();j++)
				System.out.print(sb.charAt(i+j));
				System.out.println();
			
		}
	}
	
	public static void main (String args[]){
		String str = "Archana";
		rotateString(str);
		
	}
	
	
}
