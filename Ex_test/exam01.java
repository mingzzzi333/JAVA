package Ex_test;

public class exam01 {

	public static void main(String[] args) {
		divisor(6);
	}
	
	//약수구하기
	public static void divisor(int num) {
		for(int i =1 ; i<=12;i++) {
			if(num%i==0) {
				System.out.print((i==num)?i:i+","); //삼항연산지
			}
		}
	}

}
