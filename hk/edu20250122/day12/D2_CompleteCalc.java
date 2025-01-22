package hk.edu20250122.day12;

public class D2_CompleteCalc extends D2_Calulator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2!=0) {
			return num1/num2;
		}
		else {
			return D2_Calc.ERROR;
		}
	}
	//새로운 메서드 추가
	//public void showInfo() {
	//	System.out.println("ㄹㄹ");
	//}

	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

}
