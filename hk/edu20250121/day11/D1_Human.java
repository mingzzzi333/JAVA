package hk.edu20250121.day11;

public class D1_Human extends D1_Animal {
	@Override
	public void move() {
	System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void test() {
		System.out.println("나는 인간한테만 있는 메서드야.");
	}
}
