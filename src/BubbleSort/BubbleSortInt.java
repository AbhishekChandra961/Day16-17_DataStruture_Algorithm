package BubbleSort;

import java.util.Scanner;

public class BubbleSortInt {

	void BubbleSort(int ar[],int size) {
		
		for(int i =0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
	
	void print(int ar[]) {
		for(int var : ar) {
			System.out.print(var+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		int[]ar = new int[size];
		System.out.println("Enter the "+size+" elements of the array : ");
		for(int i=0; i<size; i++) {
			ar[i] = sc.nextInt();
		}
		BubbleSortInt obj = new BubbleSortInt();
		obj.BubbleSort(ar,size);
		System.out.println("Sorted array : ");
		obj.print(ar);
	}
}
