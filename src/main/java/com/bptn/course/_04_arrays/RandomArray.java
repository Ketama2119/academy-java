package com.bptn.course._04_arrays;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[3][4];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.random() * 10);
			}
		}
		// int num [][] = new int [3][4];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}