package hk.edu20250120.day10;

public class Util {
	
	//배열에 중복 숫자가 있는지 확인하는 메서드
	//파라미터로 배열과 숫자 하나를 받아서 비교
	public static boolean isSame(int []a, int b) {
		boolean isS=false;
		for(int i =0; i<a.length;i++) {
			if(a[i]==b) {
				isS=true;
				break;
			}
		}
		return isS;
	}	
}
