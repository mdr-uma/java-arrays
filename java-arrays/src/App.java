
public class App {
	public static void main(String[] args) {
		int number = 10;
		
		//declare array with new keyword and whatever number is inside the square bracket is the number of items that array can hold		
		int[] numbers = new int[5];
		
		//int[] numbers = {15,20,25,30,35}; declaring and initializing at once.
		
		System.out.println(numbers[0]);
		
		//initialize array
		numbers[0] = 15;
		numbers[1] = 20;
		numbers[2] = 25;
		numbers[3] = 30;
		numbers[4] = 35;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		//numbers[1] to [4] will print out 0 that is default value since we did not initialize index 1 through 4 yet.		

		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		//Multidimensional array
		int[] oneDimensionalArray = {12, 49, 922};
		System.out.println(oneDimensionalArray[1]);
		//prints 49
		
		int[][] multiDimensionalArray = {{12, 49, 922}, {20, 39, 34, 3}, {10, 40, 6}};
		System.out.println(multiDimensionalArray[1][2]);
		//prints 34
		
		for(int array=0; array<multiDimensionalArray.length; array++) {
			for(int item=0; item<multiDimensionalArray[array].length; item++) {
				System.out.println(multiDimensionalArray[array][item]+"\t");
			}
			System.out.println();
		}
	}
}
