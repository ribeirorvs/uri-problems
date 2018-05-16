/**
 * 
 */
package beginner.problem1007;

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
		int x = ((Integer.parseInt(reader.readLine())*
				Integer.parseInt(reader.readLine()))-
				Integer.parseInt(reader.readLine())*
				Integer.parseInt(reader.readLine()));
		System.out.println("DIFERENCA = " + x);
	}

}
