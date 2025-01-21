package hk.edu20250121.day11;

public class D2_ComputerMain {

	
	public static void main(String[] args) {
		//(x)추상클래사는 단독을 객체생성 못함
//		D2_Computer computer =new D2_Computer(); 
		D2_Computer deskTop =new D2_DeskTop();
		deskTop.display();
		deskTop.typing();
		deskTop.turnOn();
		deskTop.turnOff();
	
		D2_Computer noteBook = new D2_MyNoteBook();
		noteBook.display();
		noteBook.typing();
		noteBook.turnOn();
		noteBook.turnOff();
		
	}
}
