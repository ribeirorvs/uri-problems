/**
 * 
 */
package beginner.problem1001;

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
		int x = Integer.parseInt(reader.readLine());
		x += Integer.parseInt(reader.readLine());
		System.out.println("X = " + x);
	}

}