package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] tester = new String[6];
		for (int i = 0; i < 6; i++) {
			tester[i] = new String("This is string number " + i);
		}
		printStrings(tester);
		reversePrint(tester);
		printEveryOther(tester);
		randomPrint(tester);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reversePrint(String[] strings) {
		for (int i = strings.length - 1; i > -1; i--) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printEveryOther(String[] strings) {
		for (int i = 1; i < strings.length; i += 2) {
			System.out.println(strings[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomPrint(String[] strings) {
		boolean[] printed = { false, false, false, false, false, false };
		Random rand = new Random();
		int numbersPrinted = 0;
		while (numbersPrinted < strings.length) {
			int number = rand.nextInt(strings.length);
			if (!printed[number]) {
			System.out.println(strings[number]);
			printed[number] = true;
			numbersPrinted++;
			}
		}
	}
}