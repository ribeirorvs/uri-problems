/**
 * 
 */
package beginner.problem1008;

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
		System.out.printf("NUMBER = " + Integer.parseInt(reader.readLine()) + "\n" +
							"SALARY = U$ %.2f\n", ((Integer.parseInt(reader.readLine()))*
									(Double.parseDouble(reader.readLine()))));		
	}

}