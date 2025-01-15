package hk.edu20250108.day02;

import java.util.Scanner;

public class exam02_73 {

	public static void main(String[] args) throws Exception{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("x 값을 입력해주세요 :");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("y 값을 입력해주세요 :");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		
		int result = x+y;
		System.out.println("x+y : " +result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열 : "+data);
			System.out.println();
		}
		
		System.out.println("종료");

	}

}
