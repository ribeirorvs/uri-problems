/**
 * 
 */
package beginner.problem1012;

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
        System.out.printf("TRIANGULO: %.3f\n"
        		+ "CIRCULO: %.3f\n"
        		+ "TRAPEZIO: %.3f\n"
        		+ "QUADRADO: %.3f\n"
        		+ "RETANGULO: %.3f\n", 
                ((Double.parseDouble(line1[0]) *
                Double.parseDouble(line1[2])) / 2), 
                (3.14159 * (Double.parseDouble(line1[2]) *
                Double.parseDouble(line1[2]))),
                (Double.parseDouble(line1[0]) +
                Double.parseDouble(line1[1])) *
                Double.parseDouble(line1[2]) / 2,
                Double.parseDouble(line1[1]) *
                Double.parseDouble(line1[1]), 
                Double.parseDouble(line1[0]) *
                Double.parseDouble(line1[1]));
    }
}
