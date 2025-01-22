package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hk.edu20250120.day10.D3_Lotto;

public class D3_ListTest {

	public static void main(String[] args) {
		//제네릭 : 형변환을 미리 정의해주는 개념
		List<String> list =new ArrayList<String>();
					list.add("한"); //값을 저장하면 자동으로 저장공간과 인덱스 생성
					list.add("경");
					list.add("닷");
					list.add("컴");
					
		String str =list.get(0); //이미 String타입으로 변환해서 저장했기 때문에
								//다시 다운캐스팅할 필요가 있다.
		
		for(int i=0; i<list.size();i++) {
			String s =list.get(i);
			System.out.println(s);
		}
		
		list.remove(0);
		//list.clear();
		System.out.println(list.size());
		
		//Lotto객체 저장해보기
		List<D3_Lotto> lottoList = new ArrayList<D3_Lotto>();
		for(int i =0; i<5; i++) {
			lottoList.add(new D3_Lotto());
		}
		
		for(D3_Lotto d3_lotto : lottoList) {
			System.out.println(Arrays.toString(d3_lotto.getLots()));
		}
		
	}
}
