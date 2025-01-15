package hk.edu20250115.day07;

public class D5_SingleTonMain {

	public static void main(String[] args) {
		
		D5_SingleTonTest st=D5_SingleTonTest.getInstance();
		st.print();
	}
}