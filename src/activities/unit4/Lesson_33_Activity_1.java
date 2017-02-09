package activities.unit4;

public class Lesson_33_Activity_1 {

	public static void main(String[] args) {
		
		String[] array = {"blah"};
		upper(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void upper(String[] array) {
		for(int i=0;i<array.length;i++) {
			array[i] = array[i].toUpperCase();
		}
	}

}
