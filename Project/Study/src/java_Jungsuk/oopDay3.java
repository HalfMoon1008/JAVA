package java_Jungsuk;

public class oopDay3 {


	public static void main(String[] args) {
		
		// 생성자와 This
		
		
		System.out.printf("\n[생성자]\n");
		Car c1 = new Car();	
		Car c2 = new Car("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

		
		//인스턴스 복사
		System.out.printf("\n[인스턴스의 복사]\n");
		Car2 c3 = new Car2();
		Car2 c4 = new Car2(c3);	// c3의 복사본 c4를 생성한다.
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
		System.out.println("c4의 color=" + c4.color + ", gearType=" + c4.gearType+ ", door="+c4.door);

		c3.door=100;	// c3의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c3.door=100; 수행 후");
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
		System.out.println("c4의 color=" + c4.color + ", gearType=" + c4.gearType+ ", door="+c4.door);
		
		
		
		
	} //main 끝

} //Class 끝


class Car {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car() {
		this("white", "auto", 4);	
	}

	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}






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
	}
}






