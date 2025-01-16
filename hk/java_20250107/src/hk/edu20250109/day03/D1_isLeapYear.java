package hk.edu20250109.day03;

import java.util.Scanner;

public class D1_isLeapYear {

	public static void main(String[] args) {
		//올해가 윤년인지 아닌지 알아보기
		//윤년이 뭐지?(365 평년), 366 (윤년)
		//윤년을 판단하는 조건을 확인
		// -년도가 4의 배수이면서 100으로 나누어 떨어지지 않는 수
		//-년도 400으로 나누어 떨어지는 수 
		
		//2025년도가 윤년인지 아닌지 확인해서 출력해보기: "2025년이 윤년이다.","2025년이 윤년이 아니다."
		
		//코드작성
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			System.out.println("궁금한 연도를 적으세요 :");
			int year = scanner.nextInt();
			
			if (year==0) {
				System.out.printf("end");
				break;
			}
			
			
			if ((year%4==0&&year%100!=0)||year%400==0) {
				System.out.printf(year+"년은 윤년이다.");
			}
			else {
				System.out.printf(year+"년은 윤년이다.");
				}
			
			
		//2000~2030까지 사이에서의 윤년구하기
			
			//원하는 범위 년도 범위 입력 받아서 실행되도록 구현
			for (int year1 = 2000; year1 <= 2030; year1++) {
				
				if ((year1%4==0&&year1%100!=0)||year1%400==0) {
					System.out.printf(year1+"년은 윤년이다.");
				}
				else {
					System.out.printf(year1+"년은 윤년이다.");
					}
				
			}
			
			
			
			}
	}

}
