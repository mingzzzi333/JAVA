package Ex_test
;

public class exam02 {

	public static void main(String[] args) {
		
		divisor(6);
		System.out.println();
		greateDivisor(15,30);
		System.out.println();
		lowestMultiple(4, 10);
		System.out.println();
		amicable(1,5000);
		System.out.println();
		perfectNum(1, 10000);
	}
	
	//메서드 단위로 구현해보기
	//약수구하기
	public static void divisor(int num) {
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
//				System.out.print(i+",");
				System.out.print((i==num)?i:i+",");//삼항연산자 활용
			}
		}
	}
	
	//최대공약수를 구하는 메서드
	public static int greateDivisor(int a,int b) {
	    //파라미터로 받자
//		int a=30;
//		int b=50;
		
		//원본값 저장해두기: a --> tempA 로 값을 전달 (값을 전달하는건 기본타입에서 가능)
		int tempA=a;
		int tempB=b;
		
		while(true) {
			//a가 b보다 클 경우
			if(a>b) {
				a=a-b;
			}
			//b가 a보다 클 경우
			if(b>a) {
				b=b-a;
			}
			
			//a와 b가 같은 경우
			if(a==b) {
				break;// 반복문을 종료하자
			}
		}//while
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n",tempA,tempB,a);
		return a;
	}
	
	//최소공배수 구하기: (a*b)/두수의 최대공약수
	public static void lowestMultiple(int a, int b) {
		//두수의 최대공약수
		int val=greateDivisor(a, b);// 반환값이 없는 메서드네??
		int result=(a*b)/val;
		System.out.println(a+"와 "+b+"의 최소공배수는 "+result+"이다");
	}
	
	//친화수구하기
	// 220 == (220의 진약수의 합: 284)->284의 진약수의 합
	// 필요한 기능: 진약수의 합을 구하는 메서드
	public static void amicable(int start, int end) {
		for (int i = start; i < end; i++) {
			if(i!=sumDivisor(i) && i==sumDivisor(sumDivisor(i))) {
				System.out.println(i+"와 "
			                        +(sumDivisor(i))
			                        +"는 친화수관계입니다.");
			}			
		}
//		System.out.println(sumDivisor(220));
	}
	
	//진약수의 합을 구하는 메서드: 합을 반환해야 됨, 반환타입은 int형
	public static int sumDivisor(int a) {
		int sum=0;//합계를 저장할 변수
		for (int i = 1; i < a; i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//완전수 구하기 : 진약수의 합과 자신의 수가 같은 경우
	public static void perfectNum(int s, int e) {
		for(int i =s; i<e; i++) {
			if(i==sumDivisor(i)) {
				System.out.println(i+"는 완전수이다.");
			}
		}
	}
	
}

