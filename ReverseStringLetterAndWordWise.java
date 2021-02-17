package GitHubCommit;

public class ReverseStringLetterAndWordWise {
	
	public static void main (String args[]){
		
		String s = "India is my country";
		String revletters = "";
		
		for (int i=s.length()-1;i>=0;i--){
			revletters = revletters + s.charAt(i);
		}
		
		System.out.println("Reversed String letters wise >--" + revletters);
		
		String[] words = s.split(" ");
		String revwords = "";
		
		for (int j=words.length-1;j>=0;j--){
			revwords = revwords + words[j] + " ";
		}
		System.out.println(revwords);
	}
		

}
