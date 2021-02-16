package GitHubCommit;

public class FindDuplicateCharacterInString {
	
	public static void main (String args[]){
		
		String str = "beautiful beach";
		
		char[] array = str.toCharArray();
		
			System.out.println("Duplicate character in given string : ");
			for (int i=0;i<array.length;i++){
				for (int j=i+1;j<array.length;j++){
					if (array[j] == array[i]){
						System.out.println(array[j] + " ");
					}
				}
			}
			
		}
	}


