package hk.edu20250122.day12;

public class D1_InterfaceMain {

	public static void main(String[] args) {
		
		//인터페이스를 타입으로 객체를 생성해서 사용할 수 있다.
		D1_InterfaceTest inter = new D1_InterfaceImp();
		inter.test();
		inter.test2();
		inter.test3();
		D1_InterfaceImp interImp = new D1_InterfaceImp();
	}
}
