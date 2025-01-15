package hk.edu20250110.day04;
import java.util.Scanner;
public class Ch4_exam07_solution {

	public static void main(String[] args) {
		
		
		int sum=0; //계좌
		
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			System.out.println("================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.print("선택>");
			
			String num="";
			if(scanner.hasNextInt()) { //입력값이 숫자라면...
				num=scanner.nextLine();
			}
			else {
				System.out.println("숫자만 입력하세요.");
				scanner = new Scanner(System.in);
				continue;
			}
			
			//예금
			if(num.equals("1")) {
				System.out.print("예금액 : ");
				sum+=Integer.parseInt(scanner.nextLine());
				}
			
			//출금
			else if(num.equals("2")) {			
				System.out.print("출금액 : ");
				sum-=Integer.parseInt(scanner.nextLine());
			}
			
			//잔고
			else if(num.equals("3")) {
				System.out.print("잔고 : "+sum+"\n");
			}
			
			else if(num.equals("4")) {
				System.out.println("프로그램 종료");	
				break;
			}
		
			else  {
			System.out.println("1~4까지 숫자만 입력하세요.");			
			}
		}
		
;	}

}
