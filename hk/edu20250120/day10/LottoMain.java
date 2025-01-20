package hk.edu20250120.day10;

import java.util.Arrays;

public class LottoMain {
	public static void main(String[] args) {
		D3_Lotto lotto =new D3_Lotto(); //로또 한장 생성
		lotto.makeLotto();
		//System.out.println(Arrays.toString(lotto.getLots()));
		
		LottoCompare compare =new LottoCompare();
//		LottoCompare compare2=new LottoCompare();
		compare.compareBall();
//		compare2.compareBall();
		
	}
}
