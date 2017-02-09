package activities.unit4;

public class Lesson_33_Activity_4 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		reverse(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void reverse(int[] array) {
		for(int i=0, j = array.length-1;i<array.length;i++,j--) {
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
//			System.out.println(i+", "+j);
		}
	}

}
