package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		
		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		
		System.out.println(food);
		System.out.print("찾을 값 입력: ");
		String n = input.next();
		System.out.println(n + "위치: " + food.indexOf(n));
		
		System.out.println("변경할 위치 입력");
		int num = input.nextInt();
		System.out.println("변경할 값 입력");
		n = input.next();
		System.out.println("변경전\n" + food);
		food.set(num, n);
		System.out.println("변경후\n" + food);
				
	}

}
