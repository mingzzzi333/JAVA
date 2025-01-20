package hk.edu20250120.day10;

//Lotto객체를 생성하면 Lotto 한장의 의미
public class D3_Lotto {

	//6개의 번호를 저장할 배열
	private int[] lots; //배열선언
	
	//default 생성자
	public D3_Lotto() {
		lots=new int[6];
		
		makeLotto(); //생성자 호출하면 바로 로또번호 실행
	}
	
	//생성자 오버로딩
	public D3_Lotto(int n) {
		lots=new int[n];
		makeLotto();
	}
	
	//1~45 까지의 숫자를 랜덤하게 생성하는 기능
	public int makeBall() {
		//Math틀래스에 random()메서드활용
		//0부터1 사이의 실수를 반환 : 0.000000..~0.999999999
		//random()에ㅔ서 반환되는 값 * 45 --> 44.99999999 =----> 0~44 +1 --> 1~45
		return (int)(Math.random()*45)+1;
		
	}
	//1~45 사이의 숫자를 배열에 넣어주는 메서드
	public void makeLotto() {
//		for(int i =0; i<lots.length;i++) {
	//		lots[i]=makeBall(); //중복숫자가 포함될 수 있음 --> 판변이 필요
		//}
		
		int count =0;
		while(count<lots.length) {
			int b =makeBall();
			if(!Util.isSame(lots,b)) { //중복되는 숫자가 없을 경우
				lots[count++]=b; //배열에 숫자 저장
			}
		}
	}
	//배열에 중복 숫자가 있는지 확인하는 메서드
	//파라미터로 배열과 숫자 하나를 받아서 비교
/*	public boolean isSame(int []a, int b) {
		boolean isS=false;
		for(int i =0; i<a.length;i++) {
			if(a[i]==b) {
				isS=true;
				break;
			}
		}
		return isS;
	}*/
	
	//배열lots는 private으로 선언 --> 클래스내에서만 접근 가능
	//public 메서드를 통해 접근하도록 getter메서드 구현
	public int[] getLots() {
		return this.lots;
	}
	
	//로또 한장 생성 (당첨번호) : new Lotto()
	
	//로또여러장 생성 (구매로또) : Lotto
	
	
}
