package GitHubCommit;

public class PrintEvenAndOddPositionCharacter {
	
	public static void main (String args[]){
		
		String str = "archanasingh";
		
		char[] array = str.toCharArray();
		
		int count = 0;
		
		String even = "";
		String odd = "";
		
		for (int i=0;i<array.length;i++){
			char ch = str.charAt(i);
			
			if (count % 2 == 0){
				even = even + ch;
			}
			else{
				odd = odd + ch;
			}
			
			count++;
		}
		
		System.out.println("Even position in the given String >-- " + even);
		System.out.println("Odd position in the give String >-- " + odd);
	}
	

}
