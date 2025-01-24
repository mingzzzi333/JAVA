package hk.edu20250123.day13;

import java.util.ArrayList;

public class D0_CardDeck {
	private static final int CDCOUND=D0_Card.IM.length*D0_Card.NUM.length;
	private ArrayList<D0_Card> card;
	
	public D0_CardDeck() {
		card=new ArrayList<D0_Card>();
		make();
	}
	public void make(){
		int count=0;
		while(true){
			D0_Card cd=new D0_Card();
			if(!isSame(card, cd)){
				card.add(cd);
				count++;
			}
			if(count==CDCOUND){
				break;
			}
		}
	}
	public ArrayList<D0_Card> getCard() {
		return card;
	}
	public boolean isSame(ArrayList<D0_Card> cd,D0_Card ca){
		boolean isS=false;
		if(cd.contains(ca)){
			isS=true;
		}
		return isS;
	}
	public void print(){
		for (int i = 0; i < card.size(); i++) {
			System.out.print(card.get(i)+"\t");
			if((i+1)%10==0){
				System.out.println();
			}
		}
		System.out.println("DECK: "+card.size()+"��");
		System.out.println("\n=========================================================================");
	}
	
}
