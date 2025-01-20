package hk.edu20250120.day10;

public class LottoStore {
	//Lotto 객체 여러개를 저장해줄 배열 선언
			public D3_Lotto[] lottoObj; // {new Lotto,new Lotto,new Lotto,....}
			
			//2차원배열{{1,2,3,4,5,6},{1,2,3,45,6,7}...}
			public D3_Lotto[][] lotsArray; //여기서는 2차원배열을 사용안함....
			public LottoStore(int m, int n) {
				this.lotsArray=new D3_Lotto[m][n];
			}
			
			public LottoStore() {
				lottoObj=new D3_Lotto[5];// 기본 5장 구매
				makeLotto();
			}
			
			public LottoStore(int n) {
				lottoObj=new D3_Lotto[n];// 원하는 수량 구매
				makeLotto();
			}
			
			public void makeLotto() {
				for (int i = 0; i < lottoObj.length; i++) {
					lottoObj[i]=new D3_Lotto();
				}
			}
	
	
	
}
