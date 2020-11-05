
public class StringManipulation {
	
	public static void countString(String input) {
		int wordCount = 0;
		String subStr = " ";
		String lastChar = "";
		
		for(int i = 0; i<input.length(); i++) {
			if(input.substring(i, i+1).equals(subStr) && !lastChar.equals(subStr)) {
				wordCount++;
			}lastChar = input.substring(i, i+1);
		}System.out.println(wordCount);
	}
}
