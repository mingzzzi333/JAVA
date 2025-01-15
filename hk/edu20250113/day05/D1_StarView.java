package hk.edu20250113.day05;

public class D1_StarView {

	public static void main(String[] args) {
		
		/*                1 2 3 4 5 ....+1
		 0 *              An = a1+(n-1)*d
		 1 **             4 = 1 +(4-1)*1 --> 1+(i-1)*1 -> 1-i-1
		 2 ***                1 + n*1 -->1+n -> 1+i
		 3 ****              --> n(자릿수)에 -1를 할 필요가없음
		 4 *****             --> 0부터 시작하니까
		                     a1 + n*d 를 적용하면 된다.

		 */
		
		//1. 왼쪽 삼각형
		for(int i =0; i<=5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();   //줄바꿈
		
		/*
		   2. 오른쪽에서 왼쪽 삼각형
		   0     *              공백을 출력하는 코드 : 식필요 -> 4 3 2 1 0 ...
		   1    **                      4+i(-1)=4-i
		   2   ***              별을 출력하는 코드 : 식 필요 -> 1 2 3 4 5 ...
		   3  ****                                   1+i
		   4 ***** 
		 */
		System.out.println("=========================");
		int num =5;
		for(int i =0; i<num;i++) {
			for(int j=0;j<num-1-i;j++) {
				System.out.print(" ");
			}
			for(int j =0; j<1+i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 3. 정삼각형
		 */
		System.out.println("=========================");
		for(int i =0; i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
				}
			for(int j =0; j<1+i*2;j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		//4. 역삼각형
		System.out.println("=========역삼각형=========");
		int num2=5;
		for(int i =0; i<num2;i++) {
			for(int j =0; j<i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<(num2*2-1)-(2*i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5. 아래 직각삼각형
		System.out.println("=========================");
		
		
	}

}
