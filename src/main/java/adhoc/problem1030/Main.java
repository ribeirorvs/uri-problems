/**
 * 
 */
package adhoc.problem1030;

import java.io.IOException;
import java.util.Scanner;
/**
 * @author roribeir
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] people;
        int step;
        for(int i = 0; i < test; i++){
            people = new int[sc.nextInt()];
            step = sc.nextInt();
            for(int j = 0; j < people.length; j++){
                people[j] = 1;
            }
            int cont = 0;
            int indice = 0;
            while(cont < people.length-1){
                int stepCheck = step;
                while(stepCheck > 0){
                    if(indice >= people.length){
                        indice -= people.length;
                    }
                    if(people[indice] != 0){
                        stepCheck--;
                        if(stepCheck == 0){
                            people[indice] = 0;
                        }
                    }
                    indice++;
                }
                cont++;
            }
            for(int k = 0; k < people.length; k++){
                if(people[k] != 0){
                    System.out.println("Case " + (i+1) + ": " + (k+1));
                    break;
                }
            }
        }
    }
}
