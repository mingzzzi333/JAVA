package hk.edu20250122.day12;

import java.util.ArrayList;
import java.util.List;

//52장의 card 객체를 저장하는 클래서
public class D4_CardCase {

	//맴버필드
	//card 52개 객체를 저장할 필드
	private List<D4_Card> cards;
	
	//카드의 총 장수를 저장할 필드 : DECK*STECK = 4*13=52
	private static final int NUMOFCARDS=D4_Card.DECK.length*D4_Card.STECK.length;
	
	
	//생성자 : 초기화...(맴버필드 초기화)
	public D4_CardCase() {

		cards=new ArrayList<D4_Card>();
		shufffle(); //
	}
	
	//메서드
	//카드객체를 생성해서 cards에 추가해줄 메서드
	public void shufffle() {
		
	}
	
}
