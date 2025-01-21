package hk.edu20250121.day11;

import java.util.Calendar;
//import java.lang.클래스명; //기본패키지라 명시적선언 필요없음
public class D3_CalendarApi {

	public static void main(String[] args) {
		int year =2025;
		int month=1;

		
		for(int i=1;i<=12;i++) {
			calPrint(2025, i);
			System.out.println();
		}
		
	}
	
	public static void calPrint(int year, int month) {
		//		Calendar cal =new Calendar(); //추상클래스라 안됨.
		Calendar cal =Calendar.getInstance();
		cal.set(year, month-1,1); //특정일로 설정
		int lastDay =cal.getActualMaximum(Calendar.DAY_OF_MONTH); //해당 달이 날들(!~31) 중에서 최대값을 가져오겠다.
		//cal.get(Calendar.YEAR);
		
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK); //1일의 요일 :0~6
		
		//년도, 월
		System.out.println(year +"년"+month+"월");
		
		//요일
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i =0; i<dayOfWeek-1;i++) {
			System.out.print("\t");
		}
		//날짜
		for(int i =1; i<=lastDay;i++) {
			System.out.print(i+"\t");
			if((i+dayOfWeek-1)%7==0) { //(공백일+현재일)%7==0 --> 토요일
				System.out.println();
			}
		}
	}
	
	
}
