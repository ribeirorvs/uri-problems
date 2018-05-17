/**
 * 
 */
package beginner.problem1011;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author roribeir
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(reader.readLine());
		System.out.printf("VOLUME = %.3f\n", ((4.0/3) * 3.14159 *
									(Math.pow(Double.parseDouble(reader.readLine()), 3))));
	}

}
