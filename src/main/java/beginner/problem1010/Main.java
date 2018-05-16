/**
 * 
 */
package beginner.problem1010;

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
		String[] line1 = reader.readLine().split(" ");
		String[] line2 = reader.readLine().split(" ");
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", 
				(Integer.parseInt(line1[1])*
				Double.parseDouble(line1[2])+
				Integer.parseInt(line2[1])* 
				Double.parseDouble(line2[2])));
	}

}
