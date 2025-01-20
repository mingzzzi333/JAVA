package hk.edu20250120.day10;

//상속받기 : 예약어 extends사용, 다중상속x
public class Child extends Parent {
	
	public Child() {
		super(); //생략가능, 항상 첫줄에 작성, 부모가 먼저 생성된다.
		System.out.println("자식의 생성자입니다.(default)");
	}
	
	public Child (int a) {
		super(a); //생략가능, 항상 첫줄에 작성, 부모가 먼저 생성된다.
		System.out.println("자식의 생성자입니다.(오버로딩)");
	}
	
	//메소드 오버라이딩: 부모의 메서드를 자식이 재정의한다.
	@Override
	public  void parentMethod() {
		System.out.println("자식이 자기 환경에 맞게 기능을 재정의함.");
	}
	
	//자식클래스에서 정의한 메서드
	public void childMethod() {
		System.out.println("자식클래스에서만 있는 메서드");
	}
	
	@Override
	public String toString() {
		return "나는 Child객체야~~";
	}
	
}
