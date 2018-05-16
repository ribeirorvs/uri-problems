/**
 * 
 */
package beginner.problem1002;

import java.io.BufferedReader;
import java.io.IOException;
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
		double R = Double.parseDouble(reader.readLine());
		System.out.printf("A=%.4f\n", 3.14159*(R*R));
	}

}
