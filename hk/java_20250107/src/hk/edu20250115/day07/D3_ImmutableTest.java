package hk.edu20250115.day07;

import java.util.Arrays;

public class D3_ImmutableTest {

	int a=10;
	
	public static void main(String[] args) {
		
		//기본타입: immutable함(값이 변경되지 않는다.)
		int aa=5;//원본
		int bb=aa;//값을 복사해서 할당
		bb=10;//재할당--> 복사받은 쪽에서 값을 변경해도 원본은 바뀌지 않는다.
		System.out.println(aa);
		
		//참조타입: mutable함(값이 변경된다.)
		int [] arrayA={1,2,3,4,5};
		int [] arrayB=arrayA;
		arrayB[0]=30;
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayA));
		
		D3_ImmutableTest i=new D3_ImmutableTest();
		change2(i);//메서드의 파라미터로 값을 전달(얕은복사)해서 값을 변경하면 
		System.out.println(i.a);//원본도 변경된다.
	}
	
	public static void change2(D3_ImmutableTest obj) {
		obj.a=30;
	}
}
