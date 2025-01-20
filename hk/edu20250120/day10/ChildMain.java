package hk.edu20250120.day10;

public class ChildMain {
	public static void main(String[] args) {
		//D3_Lotto lotto=new D3_Lotto();
		/*전혀 관령성 없는 클래스간에 상속관계 구현 -> 권장 x
		Lotto lotto =new Lotto();
		Parent parent = lotto;
		Lotto lotto2=(Lottot)parent;
		lotto2.makeBall()
		*/
		//부모의 타입으로 자식을 생성 (다형성의 원리)
		Parent p =new Child();
		p.parentMethod(); //부모의 설계도이기 때문에, 부모의 메서드가 호출되어야 하는데
											//자식의 메서드가 호출됨.
											//오버라이딩 해놔서(부모를 자식이 재정의함)
		//자식의 타입으로 자식을 생성
		Child c =new Child(10);
		c.childMethod();
		
		//부모, 자식클래스간에 형변환 가능
		Child cc=(Child)p; //int i= 10; byte b=(byte) i; 
		
		//toString() 오버라이딩
		System.out.println(cc);
	}

}
 