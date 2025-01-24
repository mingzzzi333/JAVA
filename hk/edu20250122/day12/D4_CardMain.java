package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.List;

public class D4_CardMain {

	public static void main(String[] args) {
//		D4_Card card=new D4_Card();
//		card.init();
//		System.out.println(card.toString());
		
		//List에 card객체 52장 담아보기
		//52장을 출력도 해보기
		List<D4_Card> list=new ArrayList<D4_Card>();
//		for (int i = 0; i < 52; i++) {
//			D4_Card card=new D4_Card();
//			if(!list.contains(card)) {
//				list.add(card);				
//			}
//		}
		int ii=0;
		while(true) {
			D4_Card card=new D4_Card();
			if(!list.contains(card)) {
				list.add(card);	
				ii++;
			}
			if(ii==52) {
				break;
			}
		}
	
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}//main종료
}
