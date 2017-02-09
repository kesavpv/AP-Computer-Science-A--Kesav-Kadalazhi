package activities.unit3;

public class Lesson_29_Activity_2 {
	
	public static String [] list = {};
	
	public static void main(String args[]) {
		
		String list [] = {"every", "nearing", "checking", "food", "stand", "value"};
		
		for(int i=0;i<list.length;i++) {
			for(int j = list[i].length()-1;j >= 0;j--) {
				System.out.print(list[i].charAt(j));
			}
			System.out.println();
		}
	}
}
