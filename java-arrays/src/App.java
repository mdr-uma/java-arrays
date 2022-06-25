
public class App {
	public static void main(String[] args) {
		int number = 10;
		
		//declare array with new keyword and whatever number is inside the square bracket is the number of items that array can hold		
		int[] numbers = new int[5];
		
		System.out.println(numbers[0]);
		
		numbers[0] = 15;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		//numbers[1] to [4] will print out 0 that is default value since we did not initialize index 1 through 4 yet.		

	}
}
