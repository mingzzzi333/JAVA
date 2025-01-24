package hk.edu20250123.day13;

public class D0_Card {

	public static final String[] IM={"♥","♠","♣","◆"};
	public static final String[] NUM={"A","2","3","4","5","6","7","8","9","T"};
	
	private String card;
	
	public D0_Card() {
		init();
	}
	public void init(){
		int a=(int)(Math.random()*IM.length);
		int b=(int)(Math.random()*NUM.length);
		card=IM[a]+NUM[b];
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isS=false;
		D0_Card ca=(D0_Card) obj;
		if(card.equals(ca.getCard())){
			isS=true;
		}
		return isS;
	}
	@Override
	public int hashCode() {
		return card.hashCode()+137;
	}
	@Override
	public String toString() {
		
		return "["+card+"]";
	}
	public String getCard(){
		return card;
	}
}