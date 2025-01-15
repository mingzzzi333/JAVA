package hk.edu20250115.day07;

import java.util.Arrays;

public class D4_FinalTest {

	//final: 금지의 의미
	//    - 변수에 사용: 값 변경금지
	//    - 메서드에 사용: 오버라이딩 금지
	//    - 클래스에 사용: 상속금지
	
	public final int C=10;// 초기값설정을 안하면 오류-> 반드시 초기값 정의
	public final int D;
	public static final int E=20;//진정한 상수는 static으로 정의
	
	//생성자를 통해 초기화를 할 경우 초기값 정의를 안하는것이 가능하다.
	public D4_FinalTest(int d) {
		this.D=d;
	}
	
	public static void main(String[] args) {
		int a=5;
		    a=10;//변경가능: 변수
		    
	    //상수로 선언하기
		final int B=10;
//                B=20;//변경X
		
		//메서드에 아큐먼트로 전달해서 실행
		test1(5);
		test1(10);
		
		//참조타입 배열에서 값 변경해보기
		//참조타입은 주소가 저장된다.---> 주소를 변경 금지
		final int[] arrayA = {1,2,3,4,5};
		arrayA[0]=50;
		System.out.println(Arrays.toString(arrayA));
		
		//새로운 배열객체를 저장하려고 하면 오류(주소변경)
//		arrayA=new int[5];
	}
	
	//메서드에 전달된 값을 다르게 전달할 수 있다
	public static int test1(int val) {
		final int aa=val;
		return aa;
	}

	//final을 사용하면 오버라이딩이 안됨
	//부모의 메서드를 자식이 재정의하는 방법
	@Override
	public String toString() {
		
		return this.C+"";
	}
}