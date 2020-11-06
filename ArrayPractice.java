package src;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Integer[] intList = {1,2,3,4,5,6,67,7,8};
		Integer[] anotherList = {3,5,8,6};
		Integer twoDArray[][] = {{0,1,2},{1,2,3},{2,4,6}};
		Integer doubleArray[][] = {{9,8,7},{56,76,35},{54,74,25}};
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(anotherList));
		
		for(int x=0;x<intList.length;x++) {
			System.out.println(intList[x]*10);
			
		}
		/*
		 * for(Integer item :arrayList) { System.out.println(item); } for(int i =0;
		 * i<twoDArray.length; i++) { for(int j=0;j<twoDArray[i].length;j++) {
		 * System.out.println(twoDArray[i][j]); } System.out.println(); }
		 */
	/*	for (Integer[] a : doubleArray) {
			for(int b :a) {
				System.out.println(doubleArray(b));
			}
			System.out.println();*/
		
		for(int n = 0; n>intList.length;n++) {
			System.out.println(intList[n]);
		}System.out.println();
		
	}
} 