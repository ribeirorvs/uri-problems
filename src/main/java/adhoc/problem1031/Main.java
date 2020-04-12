/**
 * 
 */
package adhoc.problem1031;

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
		int totalRegions = sc.nextInt();
		int[] regions;
		int steps = 0;
		while(totalRegions != 0) {
			regions = new int[totalRegions];
			createArray(regions);
			int count = 1;
			int index = 1;
			steps = 1;
			regions[0] = 0;
			while(count < regions.length-1) {
				int stepCheck = steps;
				while(stepCheck > 0){
					if(index >= regions.length){
						index -= regions.length;
					}
					if(regions[index] != 0){
						stepCheck--;
						if(stepCheck == 0){
							regions[index] = 0;
						}
					}
					index++;
				}
				count++;
				if(index == 13 && count != regions.length) {
					count = 1;
					index = 1;
					steps++;
					stepCheck = 0;
					createArray(regions);
					regions[0] = 0;
				}
			}
			System.out.println(steps);
			//totalRegions = sc.nextInt();
		}
		sc.close();
	}
	private static void createArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
	}
}
