package hk.edu20250121.day11;

public abstract class D2_NoteBook extends D2_Computer {
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook display");
	}
	
	
	//typing() 기능을 구현 못하는 상황 --> 반드시 어디선가는 구현해야됨.
	//							--> 강제 상속을 통한 강제 구현
	@Override
	public abstract void typing() ; //강제로 구현하게 하려면 추상 메서드로 남겨놔야함.
}
