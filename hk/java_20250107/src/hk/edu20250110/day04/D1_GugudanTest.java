package hk.edu20250110.day04;

public class D1_GugudanTest {

	public static void main(String[] args) {
		//구구단 출력하기 
		//1. 2단 출력하기
		
		for(int i=1;i<10;i++) {
			System.out.println("2 x "+i+"="+2*i);
			//System.out.println(""2X%d=%d\n",i,2*i);
			System.out.println(); //줄바꿈 기능
		}
		
		//2. 2~9단 까지 출력
		
		for(int j=2;j<10;j++) {
			for(int i=1;i<10;i++) {
				System.out.println(j+"x"+j+"="+j*i);
			}
		}
		
		//3. 2~9단 중 홀수 단만 출력하기 

		for(int j=2;j<10;j++) {
			for(int i=1;i<10;i++) {
				if(j%2==1) {
					System.out.println(j+"x"+j+"="+j*i);
				}
				System.out.println(); //줄바꿈 기능
			}
			
		}
		
		//1~100까지 정수의 총합을 출력하기: 1+2+3+...+100합
		int sum = 0;
		for(int k=1;k<101;k++) {
			
			sum +=k; //sum=sum+k 단축연산자
			System.out.println("총 합 :"+sum);
		}
		
		
		//1~100까지 정수의 중 3의 배수의 총합을 출력하기
		int sum1 = 0;
		for(int k=1;k<101;k++) {
			if(k%3==0) {
				sum1 +=k; //sum=sum+k 단축연산자
			}
			
			System.out.println("1~100중에서 3의 배수의 총 합 :"+sum1);
		}
		
		
		
		
	}

}
