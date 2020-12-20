package javaprectice;

public class FindMaxThree {

	public static void main(String[] args) {

		int[] num = { 1, 23, 21, 48, 85, 90, 356, 87, 99, 70 };
		int max1 = 0;
		int max2 = Integer.MIN_VALUE;
		int max3 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num[i];

			} // end
			else if (num[i] > max2) {
				max3 = max2;
				max2 = num[i];

			} else if (num[i] > max3) {
				max3 = num[i];
			} // end if

		} // end for loop
		System.out.println("max1 is " + max1);
		System.out.println("max2 is " + max2);
		System.out.println("max3 is " + max3);

	}

}
