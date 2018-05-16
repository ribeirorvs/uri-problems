/**
 * 
 */
package beginner.problem1006;

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
		double x = ((Double.parseDouble(reader.readLine())*2)+
				(Double.parseDouble(reader.readLine())*3) +
				(Double.parseDouble(reader.readLine())*5))/10;
		System.out.printf("MEDIA = %.1f\n", x);
	}

}
