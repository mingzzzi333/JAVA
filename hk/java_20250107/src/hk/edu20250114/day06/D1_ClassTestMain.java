package hk.edu20250114.day06;

public class D1_ClassTestMain {

	public static void main(String[] args) {
		//D1_ClassTest에 있는 methodTest()를 불러오고 싶으면. 
		D1_ClassTest classTest = new D1_ClassTest();
		
		//non-static method 호출하는 경우
		classTest.methodTest();
		
		//static method 호출하는 경우
		D1_ClassTest.staticMethodTest();
		
		//멤버필드에 저장된 값 가져오기
		int number=classTest.number;
		
		//static 필드에 저장된 값 가져오기 
		int staticNumber =D1_ClassTest.staticNumber;
		
		//인스턴스 객체 하나 더 생성 (붕어빵을 하나 더 만든거)
		D1_ClassTest classTest2 = new D1_ClassTest();
		classTest2.staticNumber=30;
		
		System.err.println(classTest2.staticNumber);
		
		//인스턴스 변수: 객체 각각에 대해 관리가 되기때문에 서로 영향이 없다.
		classTest.number=10;
		classTest2.number=50;
		
		System.out.println(classTest.number+","+classTest2.number);
	}
}
