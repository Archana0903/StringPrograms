package GitHubCommit;

public class ReverseStringPreservingThePosition {
	
	public static void reverseString(String input){
		
		char[] actualString = input.toCharArray();
		char[] reversedString = new char[actualString.length];
		
		for (int i=0;i<actualString.length;i++){
			if (actualString[i] == ' '){
				reversedString[i] = ' ';
			}
		}
		
		int j = reversedString.length-1;
		for (int i=0;i<actualString.length;i++){
			if (actualString[i] != ' '){
				if (reversedString[j] == ' '){
					j--;
				}
				
				reversedString[j] = actualString[i];
				j--;
			}
		}
		System.out.println(reversedString);
	}
	
	public static void main (String args[]){
		String str = "I love my country";
		reverseString(str);
	}
	

}
