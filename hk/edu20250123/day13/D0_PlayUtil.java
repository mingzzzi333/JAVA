package hk.edu20250123.day13;

import java.util.Scanner;

public class D0_PlayUtil {

	public D0_PlayUtil() {
		
	}
	
	public void playGame(){
			Scanner scan=new Scanner(System.in); 
			String n;
			String yes="y";
			String no="n";
		do{
			D0_CardDivide play=new D0_CardDivide();
			play.playerPrint();
			play.cardCompare();
			System.out.println("게임을 다시 시작하겠습니까?(y/n)");
			
			while (true) {
					n = scan.next();
					if(n.equals(yes)||n.equals(no)){
						break;
					}else{
						System.out.println("y또는 n으로 입력하세요~~!!");
					}
			}
			
		}while(n.equalsIgnoreCase("y"));
		System.out.println("게임을 종료 합니다.");
	}
}

