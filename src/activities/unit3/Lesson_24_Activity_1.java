package activities.unit3;

public class Lesson_24_Activity_1 {
	public static void main(String args[]) {
		
		int i, ct = 0;
		
		for(i=23;i<=89;i++) {
			System.out.print(i+" ");
			ct++;
			if(ct == 10) {
				ct = 0;
				System.out.println();
			}
		}
	}
}
