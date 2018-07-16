/**
 * 
 */
package adhoc.problem1031;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author roribeir
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		ArrayList <Integer> input = new ArrayList<>();
		do{
			if(test == 0)
				break;
			input.add(test);
			test = sc.nextInt();
		}while(true);
        int[] regions;
        int[] results = new int[input.size()];
        int step;
        boolean verifyLast;
        for(int i = 0; i < input.size(); i++){
            regions = new int[input.get(i)];
            step = 1;
            for(int j = 0; j < regions.length; j++){
                regions[j] = 1;
            }
            verifyLast = false;
            while(!verifyLast){
            	int cont = 0;
                int indice = 0;
            	while(cont < regions.length-1){
                    int stepCheck = step;
                    while(stepCheck > 0){
                        if(indice >= regions.length){
                            indice -= regions.length;
                        }
                        if(regions[indice] != 0){
                            stepCheck--;
                            if(stepCheck == 0){
                                regions[indice] = 0;
                            }
                        }
                        indice++;
                    }
                    cont++;
                }
            	if(indice == 12) {
            		verifyLast = true;
            		System.out.println("Step: " + step);
            		System.out.println("Indice: " + indice);
            	} else {
            		System.out.println("Step: " + step);
            		System.out.println("Indice: " + indice);
            	}
            	if(verifyLast) {
            		results[0] = step;
            	} else {
            		step++;
            		for(int j = 0; j < regions.length; j++){
                        regions[j] = 1;
                    }
            	}
            }
            for (int x : results) {
				System.out.println(x);
			}
            /*for(int k = 0; k < results.length; k++){
                if(regions[k] != 0){
                    System.out.println("Case " + (i+1) + ": " + (k+1));
                    break;
                }
            }*/
        }
        
        sc.close();
    }

}