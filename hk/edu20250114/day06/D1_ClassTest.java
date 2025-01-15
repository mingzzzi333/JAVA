package hk.edu20250114.day06;

public class D1_ClassTest { 

	//멤버필드 : 클래스 안에서 값을 저장해서 사용되는 변수
	//private int number; 호출 안됨.
	public int number; //인스턴스 변수
	public static int staticNumber; // 클래스 변수	
	
	//기본생성자 (default 생성자)
	// -> 파라미터X, 혼자쓰이면 생략 가능, 클래스의 초기화 작업을 수행
	public D1_ClassTest() {
		super(); //super라는 용어는 부모클래스를 의미. 여기서 super는 Object클래스의 default생성자 의미
		this.number = 5; //this : 자기 자신을 뜻함. ClassTest클래스, ()는 생성자
		
	}
	
	
	//생성자 오버로딩 : 생성자 이름은 같고 파라미터 개수나 타입을 다르게 작성
	//생성자 오버로딩하면 디폴트 생성자 생략 못함.
	public D1_ClassTest(int number) {  
		this.number=number;
	}
	
	//메서드 : 기능구현
	//호출 : 객체생성 후 -> 객체명.메서드();
	public void methodTest() {
		System.out.println("클래스 내부에 기능을 정의한다.");
	}
	
	//호출 : 객체생성 X -> 클래스명.메서드();
	public static void staticMethodTest() {
		System.out.println("static 메모리에 생성되는 메서드");
	}
	
	
	
	

}
