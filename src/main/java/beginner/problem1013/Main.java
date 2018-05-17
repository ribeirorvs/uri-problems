/**
 * 
 */
package beginner.problem1013;

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
		System.out.println(((/*a*/Integer.parseInt(line1[0]) +
							/*b*/Integer.parseInt(line1[1]) + 
							Math.abs(/*a*/Integer.parseInt(line1[0]) - 
									/*b*/Integer.parseInt(line1[1])))/ 2 +
							/*c*/Integer.parseInt(line1[2]) +
							Math.abs((/*a*/Integer.parseInt(line1[0]) +
									/*b*/Integer.parseInt(line1[1]) + 
									Math.abs(/*a*/Integer.parseInt(line1[0]) - 
											/*b*/Integer.parseInt(line1[1])))/ 2 -
											Integer.parseInt(line1[2]))) / 2
							+ " eh o maior");
		
	}

}
