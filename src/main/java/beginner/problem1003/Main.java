/**
 * 
 */
package beginner.problem1003;

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
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		System.out.println("SOMA = " + (A+B));
	}

}
