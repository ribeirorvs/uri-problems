package adhoc.problem1026;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long x, y;
		while (sc.hasNext()) {
			x = sc.nextLong();
			y = sc.nextLong();
			System.out.println(x^y);
		}
		sc.close();
	}
}