/**
 * 
 */
package beginner.problem1005;

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
		double x = Double.parseDouble(reader.readLine())*3.5;
		x += Double.parseDouble(reader.readLine())*7.5;
		System.out.printf("MEDIA = %.5f\n", (x/11));
	}
}
