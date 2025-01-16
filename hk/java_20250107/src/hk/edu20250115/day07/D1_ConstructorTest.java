package hk.edu20250115.day07;

public class D1_ConstructorTest {
	
	
	public static void main(String[] args) {
		D1_ConstructorTest con1 =new D1_ConstructorTest();
		System.out.println(con1.color);
		
		D1_ConstructorTest con2 =new D1_ConstructorTest(900);
		System.out.println(con2.size);
		
		D1_ConstructorTest [] test = new D1_ConstructorTest[2];
		test[0]=con1;
		test[1]=con2;
	}

	private int size=0; //중요한 데이터인 경우 노출금지
	public String color="검정색";
	
	
	//default  생성자는 단독으로 사용할 경우 생략 가능
	// 오버로딩을 하게 되면 생략할 수 없다.
	//생성자 호출은 반드시 첫줄에 작성해야한다.

	public D1_ConstructorTest() {
		//super();  //Object() 생성자 호출
		this(100,"black"); //생성자는 첫줄에 작성해야 한다.
	}
	
	public D1_ConstructorTest (int size) {
		super();
		this.size=size;
	}

	public D1_ConstructorTest(int size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
		
}
