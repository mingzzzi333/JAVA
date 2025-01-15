package hk.edu20250110.day04;

public class Ch4_exam04 {

	public static void main(String[] args) {
		//교재에 챕터문제4 확인문제 4번
		//Math.random() 주사위1 눈 1~6
		//Math.random() 주사위2 눈 1~6
		// 두 수의 합을 구해서 5이면 종료
		
		while(true) {
			int num1 =(int)(Math.random()*6)+1;
			int num2 =(int)(Math.random()*6)+1;
			
			System.out.println("("+num1+","+num2+")");
			if(num1+num2==5) {
				System.out.println("합이 5가 되어 종료");
				break;
			}
					
		}
		

	}

}
