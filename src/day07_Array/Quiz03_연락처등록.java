package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_연락처등록 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phone = new ArrayList();

		String n, p;
		int num = 0, result = 0;
		boolean bool = true;

		while(bool) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.println(">>>");

			num = input.nextInt();

			switch(num) {
			case 1:
				System.out.println("이름 입력: ");
				n = input.next();

				if(name.indexOf(n) == -1) {
					System.out.println("연락처 입력: ");
					p = input.next();
					name.add(n); phone.add(p);
				} else {
					System.out.println("이름이 존재합니다."); 
				} break;
			case 2: 
				System.out.println("찾을 이름 입력: ");
				n = input.next();
				result = name.indexOf(n);
				if(result == -1) {
					System.out.println(n + "님은 목록에 없습니다.");
				} else {
					System.out.println(name.get(result) + ":");
					System.out.println(phone.get(result));
				}
				break;

			case 3:
				System.out.println("삭제할 이름 입력: ");
				n = input.next();
				result = name.indexOf(n);
				if(result == -1) {
					System.out.println(n + "님은 목록에 없습니다.");
				} else {
					System.out.println(name.remove(result) + ":");
					System.out.println(phone.remove(result)+ "삭제 됨");
				}
				break;

			case 4: 
				for(int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i) + ":");
					System.out.println(phone.get(i));
				}
				break;

			case 5:
				bool = false;
			}

		}
		System.out.println("종료합니다.");

	}

}
