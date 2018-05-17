/**
 * 
 */
package beginner.problem1014;

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
		System.out.printf("%.3f km/l\n", 
							Integer.parseInt(reader.readLine()) / 
							Double.parseDouble(reader.readLine()));
	}

}
