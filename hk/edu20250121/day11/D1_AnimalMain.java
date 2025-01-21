package hk.edu20250121.day11;

public class D1_AnimalMain {
	public static void main(String[] args) {
		
		//부모의 타입으로 자식객체를 생성함
		D1_Animal human = new D1_Human();
		human.move(); //부모의 메서드 move()를 호출하지만
					//오버라이딩했기때문에 자식의 move()가 실행된다.
		
		D1_Human humanChild = (D1_Human) human; //강제 형변환/그냥하면 더 큰걸 작은거에 넣으려고하게됨.
		humanChild.test(); //자식의 설계도가 올라갔었기 떄문에
							//자식에서 구현한 메서드도 사용할 수 있다.
		
		System.out.println("===================================================");
		
		//다형성 발생원래 3가지
		//1. 부모의 타입으로 자식을 생성한다.
		D1_Animal animal1=new D1_Human();
		D1_Animal animal2=new D1_Tiger();
		D1_Animal animal3=new D1_Eagle();
		
		
		//2. 부모의 타입으로 자식을 참조한다.
		D1_Human human1 =new D1_Human();
		D1_Animal animal4=human; //부모타입으로 참조한다.
		
		moveAnimal(new D1_Human());
		
		
	}
	//상속관계가 아니면 하나의 타입만 받을 수 이싸. -> 파라미터로 받을 경우
	//--> 부모의 타입으로 받자
	public static void moveAnimal(D1_Animal animal) {
		//파라미터로 전달받은 객테의 형태에 따라 move()메서드의 기능이 다양하게 표현됨.
		animal.move(); //다형성
		
		//파라미터 animal이 어떤 객체인지 확인해서 처리하고 싶다면
		//-->오버라이딩이 안된 메서들에 대한 처리가 필요하면
		if(animal instanceof D1_Human) {   //같은 객체인지 비교(상속관계에 하위객체)
			D1_Human human =(D1_Human)animal;
			human.test();
			
		}else if(animal instanceof D1_Eagle) {
			D1_Eagle eagle = (D1_Eagle)animal;
		}
		
	}
}
