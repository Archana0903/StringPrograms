package GitHubCommit;

import java.util.StringTokenizer;

public class RemoveSpacesInString {
	
	public static void main (String args[]){
		
		String str = " hello           world";
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while (st.hasMoreElements()){
			sb.append(st.nextElement()).append(" ");
			
		}
		System.out.println("After removing the extra spaces >>-- " + sb);
	}

}
