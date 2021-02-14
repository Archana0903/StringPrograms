package GitHubCommit;

public class ExtractNumbersFromStringAndAdd {
		
	public static void main (String args[]){
		
		String str = "archana17singh12";
		
		int sum = 0;
		
		boolean reg = str.matches("([A-Za-z]+[0-9]|[0-9][A-Za-z])[A-Za-z0-9]*");
		
		if (reg == true){
			for (int i=0;i<str.length();i++){
				char ch = str.charAt(i);
				
				if (Character.isDigit(ch)){
					sum = sum + (Character.getNumericValue(ch));
				}
			}
		}
		System.out.println("Sum of extracted number is " + sum);
	}
	

}
