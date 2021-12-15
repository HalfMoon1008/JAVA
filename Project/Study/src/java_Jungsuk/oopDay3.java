package java_Jungsuk;

public class oopDay3 {


	public static void main(String[] args) {
		
		// 생성자와 This
		
		// 생성자
		// 클래스를 생성하고, 인스턴스를 호출 할 때
		// 사용자가 반드시 해야만 하는 일을 강제시킬 수 있음
		// ⟹ 인스턴스 변수들을 초기화하기 위해서 사용
		
		System.out.printf("\n[생성자]\n");
		Calculator ca = new Calculator(10,20);
		// Calculator 클래스의 생성자가 Calculator(int left, int right)의
		// 형태이기 때문에, 매개변수를 쓰지 않는 다면 에러가 발생함.
		// 매개변수 사용을 강제하는 것.
		ca.sum();
		ca.avg();
		
		
		
		
		
		// This
		// 	1) 메서드 안에서 this()의 형태로 사용할 경우,
		// 	   해당 메서드 안에서 쓰인 다른 생성자(오버로딩 된)
		//     생성자를 불러오게 된다.
		// 	2) this.변수명
		//	   해당 인스턴스 메서드 안에 있는 지역 변수가 아닌
		//	   클래스 차원의 변수(전역변수)를 불러온다.
		
		// ⎡ 생성자의 오버로딩
		// ├ this()에 의한 생성자 호출
		// ⎣ this를 통한 전역변수 호출
		System.out.printf("\n[생성자의 오버로딩]\n");
		Car c1 = new Car();	
		Car c2 = new Car("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

		
		
		
		
		// 인스턴스 복사
		System.out.printf("\n[인스턴스의 복사]\n");
		Car2 c3 = new Car2();
		Car2 c4 = new Car2(c3);	// c3의 복사본 c4를 생성한다.
				
		//	class Car2 {
		//		String color;	
		//		String gearType;   
		//		int door;		
		//
		//		Car2(Car2 c) {				// 인스턴스의 복사를 위한 생성자.
		//						color    = c.color;
		//						gearType = c.gearType;
		//						door     = c.door;
		//					}
		//	}
		
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
		System.out.println("c4의 color=" + c4.color + ", gearType=" + c4.gearType+ ", door="+c4.door);

		c3.door=100;	// c3의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c3.door=100; 수행 후");
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
		System.out.println("c4의 color=" + c4.color + ", gearType=" + c4.gearType+ ", door="+c4.door);
		
		
		
		
	} //main 끝

} //Class 끝


// 생성자 예제 1
class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left= left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}





// 생성자 overloading 예제
class Car {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car() {
		this("white", "auto", 4);	
		// this()를 이용한 생성자
		// Car(String color, String gearType, int door의 호출
		// 호출한 생성자에 변수값을 넣어 초기화 하는 방식
	}

	Car(String color){
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
		//this를 이용한 전역변수 호출
	}
}





// 복사 예제
class Car2 {
	String color;		// 색상
	String gearType;    // 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4);
	}

	Car2(Car2 c) {	// 인스턴스의 복사를 위한 생성자.
		color    = c.color;
		gearType = c.gearType;
		door     = c.door;
	}

	Car2(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
		
// 블록 초기화 예제
	}
}






