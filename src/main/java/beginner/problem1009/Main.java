/**
 * 
 */
package beginner.problem1009;

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
		reader.readLine();
		System.out.printf("TOTAL = R$ %.2f\n", ((Double.parseDouble(reader.readLine())) +
									(Double.parseDouble(reader.readLine())*0.15)));	
	}

}
