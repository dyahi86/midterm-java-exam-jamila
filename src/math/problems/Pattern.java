package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		//.
			//	number >=90, it decreases number by 1.
		// number is between 70 and 89 ,  decreases  by 2.
		// number is less than decreases  by 3.
		//
		int number = 100;

		while (number >= 0) {
			System.out.print(number + ",");
			if (number > 90) {
				number--;
			} else if (number > 70) {
				number -= 2;
			} else {
				number -= 3;
			}
		}
	}
}
		




