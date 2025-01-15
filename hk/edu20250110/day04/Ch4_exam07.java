package hk.edu20250110.day04;
import java.util.Scanner;
public class Ch4_exam07 {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("================================");
		
		int num1;
		int sum=0; //계좌
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("선택>");
		int num =scanner.nextInt();
		
		while(true) {
			//예금
			if(num==1) {
				Scanner ad =new Scanner(System.in);
				System.out.print("예금액 : ");
				int addmoney =scanner.nextInt();
				sum+=addmoney;
				System.out.print(sum);
				}
			
			//출금
			else if(num==2) {
				Scanner sub =new Scanner(System.in);
				System.out.print("출금액 : ");
				int addmoney =scanner.nextInt();
				sum+=addmoney;
				System.out.print(sum);
			}
			
			//잔고
			else if(num==3) {
				System.out.print(sum);
			}
			
		
			else  {
			System.out.println();
			System.out.println("프로그램 종료");			
		}
		
		
		
	}

	}
}
