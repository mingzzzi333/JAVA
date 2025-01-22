package hk.edu20250122.day12;

public class D1_InterfaceImp implements D1_InterfaceTest{

	@Override
	public int test() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	//default메서드: 재정의 할거면 오버라이딩하고, 아니면 그냥 쓰면됨.
	public void test3() {
		D1_InterfaceTest.super.test3();
	}

}
