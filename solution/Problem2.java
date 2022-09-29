package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem2 {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		a = scan.nextInt();

		List<String> list = new ArrayList<String>();

		while (j < a) {

		

			if (i % 2 != 0) {
				j++;
				list.add(String.valueOf(i));
			}
			i++;
		}
		String s = String.join(",", list);
		System.out.println(s);
	}
}