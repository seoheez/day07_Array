package day07_Array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("짝수, 홀수 입력: ");
		odd_even = input.next();
		
		
		if(odd_even.equals("짝수")) { //==로 비교하면 안되고 equals를 사용해야함.
			for(int i=0; i<arr.length; i++) {
				if(arr[i] % 2 == 0) {
					System.out.println(odd_even + " : " + arr[i]);
				}
			}
		}else {
			for(int i=0; i<arr.length ; i++) {
				if(arr[i] % 2 == 1) {
					System.out.println(odd_even + " : " + arr[i]);
				}
			}
				
		}
		// 다른 방법
		System.out.println("==========================");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0 & odd_even.equals("짝수")) {
				System.out.println(odd_even + " : " + arr[i]);
			}else if(arr[i] % 2 == 1 && odd_even.equals("홀수")) { //else(x)
				System.out.println(odd_even+ " : " + arr[i]);
			}
				
		}
	}

}
