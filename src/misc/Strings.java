package misc;

public class Strings {
	public static void main(String[] args) {
		
		String words[] = {"BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATE","BEREFT", "BEWILDER"};
		
		for (int i=0; i< words.length; i++) {
		    if (words[i].substring(0, 3).compareTo ("BEN") != 0 ) {
		        System.out.println(words[i]);
		    }
		}
	}
}
