package java_Jungsuk;

public class oopDay1 {

	public static void main(String[] args) {

		// 객체 지향 프로그래밍 (Object-Oriented Programming)
		// 핵심 : 상속, 캡슐화, 추상화 개념
		// 특징 : 재사용성, 관리 용이, 신뢰성
		
		// 클래스
		// 정의 : 객체를 정희해 놓은 것
		// 용도 : 객체를 생성하는데 쓰임
		
		// 객체
		// 정의 : 실제로 존재하는 것. 사물 또는 개념
		// 용도 : 기능과 속성에 따라 다름
		// Ex) 유형의 객체 : 책상, 의자, 자동차, TV와 같은 사물
		//	   무형의 객체 : 수학 공식, 프로그램 에러와 같은 논리나 개념
		
		//		클래스			객체
		//		제품 설계도	|	제품
		//		TV 설계도		|	TV
		//		붕어빵 기계	|	붕어빵
		
		// 클래스와 객체와 인스턴스의 개념
		// 클래스 - 붕어빵 기계
		// 객체 - 붕어빵이라는 사물 자체의 정의
		// 인스턴스 - 붕어빵 기계에서 만든 붕어빵
		// 붕어빵은 객체다. 
		// 붕어빵은 붕어빵 기계 클래스의 인스턴스다.
		
		// 객체의 구성 요소
		// 구성 : 속성, 기능
		// ex)  TV객체
		//		속성 : 색상, 전원, 채널
		//		기능 : 전원On/Off, ChannelUp, ChannelDown
		
		
		System.out.printf("[TV OOP 예제]\n");
        Tv t;                  // Tv인스턴스를 참조하기 위한 변수 t를 선언       
        t = new Tv();          // Tv인스턴스를 생성한다. 
        t.channel = 7;         // Tv인스턴스의 멤버변수 channel의 값을 7로 한다. 
        t.channelDown();       // Tv인스턴스의 메서드 channelDown()을 호출한다. 
        System.out.println("현재 채널은 " + t.channel + " 입니다."); 
        
        
        
        
        
        System.out.printf("\n[TV OOP 인스턴스 예제]\n");
        Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7;	// channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		
		
		
		
		
        System.out.printf("\n[TV OOP 참조변수 예제]\n");		
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		System.out.println("t4의 channel값은 " + t4.channel + "입니다.");

		t4 = t3;		// t3이 저장하고 있는 값(주소)을 t4에 저장한다.
		t3.channel = 7;	// channel 값을 7로 한다.
		System.out.println("t3의 channel값을 7로 변경하였습니다.");

		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		System.out.println("t4의 channel값은 " + t4.channel + "입니다.");
		//t4의 참조변수를 t3로 했기 때문에, t3과 t4은 같은 참조변수를 바라보며,
		//기존에 존재했던 t4 본래의 참조변수는 더 이상 사용할 수 없게 됐다.
		
		
		
		
		System.out.printf("\n[TV OOP 객체배열 예제]\n");		
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열

		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i < tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
		}

		for(int i=0; i < tvArr.length;i++) {
			tvArr[i].channelUp();  // tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		
	}//main 종료

}

class Tv { 
    // Tv의 속성(멤버변수) 
    String color;           	// 색상 
    boolean power;         	// 전원상태(on/off) 
    int channel;           	// 채널 

    // Tv의 기능(메서드) 
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드  
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
}
