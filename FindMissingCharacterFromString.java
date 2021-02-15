package GitHubCommit;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingCharacterFromString {
	
	public static void main (String args[]){
		
		String str = "archanasingh";
		
		String[] givenString = str.split("");
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(givenString));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
		
		set2.removeAll(set1);
		System.out.println("Missing Charecters are : " + set2);
	}
	
	

}
