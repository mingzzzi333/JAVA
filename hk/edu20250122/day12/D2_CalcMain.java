package hk.edu20250122.day12;

public class D2_CalcMain {

	public static void main(String[] args) {
		//인터페이스 타입으로 객체 생성
		D2_Calc calc =new D2_CompleteCalc();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.divide(30, 2));
		
//		System.out.println(calc.showInfo()); 호출안됨 
		//하위클래스에 showInfo()사용하려면
		//하위 클래스 타입으로 형변환 해야함.
		D2_CompleteCalc calc2 =(D2_CompleteCalc)calc; //상위개념을 하위에 넣으려니까 안됨 , 다운캐스팅해야함
		calc2.showInfo();
	}
	

}
