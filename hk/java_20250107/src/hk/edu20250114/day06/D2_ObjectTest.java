package hk.edu20250114.day06;

import java.util.List;

import hk.edu20250110.day04.D1_GugudanTest;


public class D2_ObjectTest {
	
	

	//Object 클래스 : 최상위 객체 -> 모든 클래스 부모
	public static void main(String[] args) {
		
		//getCLass() 메서드 : 클래스 위치를 반환
		String str = new String("객체"); //"객체"가 생성자 -> 오버로딩//getClass() -> 위치

		D1_ClassTest classTest = new D1_ClassTest();
		System.out.println(classTest.getClass());
		
		//toString()메서드 : 문자열을 반환
		//대상이 참조타입일 경우 "@위치hashcode" 반환
		System.out.println(classTest.toString());
		//대상이 기본타입일 경우 "값"반환
		int a=10;
		Integer aa = 10; //Wapper클래스  기본타입 ---> 참조타입 변환
		System.out.println(aa.toString()); //기본타입도 참조타입의 기능 사용가능
		
		//hashcode() 메서드, : 객체의 hashcode를 반환
		System.out.println(classTest.hashCode());
		D1_ClassTest classTest2=new D1_ClassTest();
		System.out.println(classTest2.hashCode());
		
		//equals() 메서드 : 객체간 비교기능을 제공(hashcode로 비교한다.)
		//				hashCode()메서드를 이용해서 비교...
		//주고 문자열 비교할 때 많이 사용됨 
		//문자열의 리터럴선언, 객체선언 방식에 따라 비교 결과가 달라질 수 있다.
		//  --> 무조건 문자열 비교는 equals()로 사용하자
		//String은 문자열의 내용이 같으면 hashcode를 같데 만들어 놓았음
		String s="a";
		String ss="a";
		System.out.println(s==ss); //== : 주소로 비교한다.
		System.out.println(s.equals(ss)); //hashcode 비교
		
		String sss = new String("a");
		System.out.println(s==sss); //주소가 다르다
		System.out.println(s.equals(sss)); //hashcode 비교
		
		
		D1_GugudanTest gugu=new D1_GugudanTest();
		List<String> list;
		
		
	}

}
