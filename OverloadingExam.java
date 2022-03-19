package myHomework;

public class OverloadingExam {
	int intI;
	String strS;
	//1. 메소드의 이름은 동일해야한다. 
	public void method() {
		
	}
	//2. 매개변수의 타입이 달라야한다. 
	public void method(int intI) { //같은 int 또 나온면 안된다. 
		
	}
	public void method(String strS) {
		
	}
	//3. 매개변수의 갯수가 달라야한다. 
	public void method(int intI,String strS) {
	}
	//4.[주의] 위치가 달라지면 다르게 인식한다. 
	public void method(String strS, int intI) {
		
	}
}
