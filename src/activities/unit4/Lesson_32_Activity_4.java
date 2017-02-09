package activities.unit4;

public class Lesson_32_Activity_4 {

	public static void main(String[] args) {
		realTime(6342);
	}
	
	public static void realTime(int seconds) {
		System.out.println("Hours: "+(seconds/3600));
		seconds %= 3600;
		System.out.println("Minutes: "+(seconds/60));
		seconds %= 60;
		System.out.println("Seconds: "+seconds);
	}

}
