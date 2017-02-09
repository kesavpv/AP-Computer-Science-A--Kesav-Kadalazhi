package activities.unit3;

public class Lesson_29_Activity_1 {
	
	public static String [] list = {};
	
	public static void main(String args[]) {
		
		String[] list = {"high", "every", "nearing", "checking", "food ", "stand", "value", "best", "energy", "add", "grand", "notation", "abducted", "food ", "stand"};
		
		int s = 0;
		
		for(int i=0;i<list.length;i++) {
			if(list[s].length() < list[i].length()) {
				s = i;
			}
		}
		
		System.out.println(list[s]);
	}
}
