package hk.edu20250115.day07;

//덧셈기능 클래스
public class D2_CalculatorD {
	//계산할 값 2개를 저장할 멤버필드 선언
	public int num1;
	public int num2;
	
	//계산결과는 중요하니깐 바로 접할 수 없게 private선언
	private int result; //결과를 저장할 멤버 필드
	
	
	//default 생성자
	public D2_CalculatorD() {    
//		this.num1 =10; //값 받아서 초기화
//		this.num2 =20;
		this(10,20); //코드 중복 제거
	}
	
	
	//생성자 오버로딩
	public D2_CalculatorD(int num1, int num2) {
		this.num1 =num1; //값 받아서 초기화
		this.num2 =num2;
	}
	
	//기능정의 : 곱셈연산
	public void a() {
		this.result=this.num1*this.num2;
	}


	//연산된 계산 결과를 가져오는 메서드
	public int getResult() {
		return result;
	}

	
}

