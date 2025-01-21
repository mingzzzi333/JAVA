package hk.edu20250121.day11;

import java.util.Iterator;

public class D3_Calendar {

	
	//윤년, 평년일때 달의 마지막 날짜
	private static final int[]leap= {30,29,31,30,31,30,31,31,30,31,30,31};
	private static final int[]plain= {30,28,31,30,31,30,31,31,30,31,30,31};
	
	//윤년을 판단하는 메서드
	public boolean isLeapYear(int year) {
		boolean isS=false;
		if((year%4==0 &&year%100!=0)||year%400==0) {
			isS = true;
		}
		return isS;
	}
	
	//현재 2025년 5월 1일이라면,,
	//경과일 구할때 : 1년~~ 2014년 까지의 경과일을 구함. <- 고려사항 : 윤년(366), 평년 (365)
	//			1월~~~4월까지의 경과일을 구함 <- 고려사항 : 윤년 (29), 평년 (28)
	//			5월1일을 더해서 경과일 완료
	
	
	//1년~~~2024년 까지의 경과일을 구함
	public int dates(int year) {
		int tot=0;
		for(int i=1;i<year;i++) {  //i는 년도를 나타냄
			if(isLeapYear(i)) {
				tot+=366;				
			}else {
				tot+=366;
			}
		}
		return tot;
	}
	
	//1월~4월까지의 경과일을 구함
	public int dates(int year, int month) {  //메서드 오버로딩
		int tot=dates(year); //초기값은 천년도까지의 경과일로 할당
		for(int i=1;i<month;i++) {
			if(isLeapYear(year)) {
				tot+=leap[i-1];  //i는 달로 쓰임, i-1을 해야 인덱스 일치
			}else {
				tot+=plain[i-1];
			}
		}
		return tot;
	}
	
	//5월 1일을 더해서 경과일 완료
	public int dates(int year, int month, int date) {
		return dates(year,month)+date;
	}
	
	//구하려는 달의 마지막날을 구하는 기능
	public int lastDay(int year, int month) {
		
		return isLeapYear(year)?leap[month-1]:plain[month-1]; //삼항연산자
	}
	
	public void calendarPrint(int year, int month) {
		System.out.println(year+"년"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//공백수 : 경과일%7 =나머지
		//2025.01.01 : 1일까지 포함  --> 29 30 31 1 나머지 4-1
		//1.1.1(월)~2025.1.1
		int dayOfWeek=dates(year, month, 1)%7;  //-1
		
		//달력의 공백수 출력
		for(int i =0; i<dayOfWeek;i++) {
			System.out.print("\t");
		}
		
		//날짜 출력
		for(int i =1; i<=lastDay(year, month);i++) {
			System.out.print(i+"\t");
			if((dayOfWeek+i)%7==0) { //(공백일+현재일)%7==0 --> 토요일
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		D3_Calendar cal =new D3_Calendar();
		cal.calendarPrint(2025, 1);
	
		for(int i=1;i<=12;i++) {
			cal.calendarPrint(2025, i);
			System.out.println("\n");
		}
	}
	
}
