package hk.edu20250113.day05;

public class D2_MethodTest {
	
	//default 생성자
	public D2_MethodTest() {
		//생략이 가능하다.( 상황에 따라 생략을 할 수 없는 경우도 있음)
	}

	
	//jajva.exe. 실행되면 JNM이 싱행되면서 main메서드를 찾아서 실행..
	public static void main(String[] args) {
		test01(); //메서드를 실행하려면.. 또는 자바코드를 실행하려면 main메서드에서 실행
		//test02(); //non-static ---> static에서 호풀 못함 X
		//non-static를 main메서드에서 실행하고 싶으면 
		//객체 생성과정 (인스턴스화): Heap 메모리에 생성이 됨.
		D2_MethodTest d2_test = new D2_MethodTest(); //Heap이라는 메모리에 올라감 D2메서드 생성됨.	
		d2_test.test02(); //객체명. 메서드()로 호출 할 수 있다.
		int result = test05(10,(byte)5); //파라미터를 통해 메서드에 값을 전달하고 return에 의해 값을 반환해서 받을 수 있다.
	}
	//static 메서드 -> 인지시켜서 컴터가 쓸 수 있는 상태를 만든다.
	//메서드의 유형
	//1. static과 non-static
	public static void test01() {
		System.out.println("static메서드");
	}
	
	//non-static ---> 설계만 되어있는 상태
	public void test02() {     //public static void test02()  1. static를 붙이던지
		System.out.println("non-static 메서드");
	}
	
	//2. 반환타입 O /반환타입 X
	public int test03() { //메서드 이름 앞에 반환 타입 선언해야 함.
		return 0;
	}
	
	public void test04() { //반환타입이 없다면 void 정의해야함
		//코드를 실행하고 끝나는 작업... 반환값 x
	}
	
	
	//파라미터 O/X :메서드의 외부로부터 값을 전달받아서 처리할 경우 
	public static int test05(int a, byte b) {
		int result =a+b;
		System.out.println(result);
		return result;
	}

}
