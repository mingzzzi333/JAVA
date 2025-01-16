package hk.edu20250114.day06;

public class D3_AccessMain {

	public static void main(String[] args) {
		D3_AccessTest access = new D3_AccessTest();
		int a =access.a;
		int b =access.b;
		access.setC(5); //c는 private접근제한자라 접근 못함.
		int c=access.getC(3);
		System.out.println(c);//메서드를 통해서 접근할 수 있다.
	}
	
}
