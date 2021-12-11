package java_Jungsuk;

public class oopDay2 {

	public static void main(String[] args) {
		
		// static은 클래스 멤버(클래스 변 & 클래스 메서드)를 선언할 때 사용한다.
		// static의 속성은 공용으로 사용하는 것.
		// Ex) 아래 예시에서 카드의 폭과 높이는 모든 카드에 들어가는 요소이기에 static을 사용
		
		// static이 붙지 않은 변수 혹은 메서드를 인스턴스라고 한다.
		// 인스턴스는 각 객체 고유의 성질을 표현할 때 쓰인다.
		// 인스턴스 변수의 경우, 인스턴스 안에서만 사용이 가능하다.
		// 인스턴스 메서드의 경우, 인스턴스 메서드에서만 사용이 가능하다.
		// Ex) 트럼프 카드의 무늬와 숫자는 각 카드 고유의 성질이다.
		
		// Ex) 트럼프 카드
		// static - 카드의 폭과 높이
		// instance - 카드의 무늬와 숫자
	
		System.out.printf("[Static & Instance]\n");
		System.out.println("Card.width = "  + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );		

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;
		// 클래스 변수인 width와 height는 따로 생성하지 않고, 모든 곳에서 공용으로 사용되는 성질
		// 즉슨, 클래스 변수를 C1 인스턴스 메서드 안에서 초기화해도,
		// C1의 인스턴스의 참조 변수를 가리키는 것이 아닌, 클래스 변수의 참조변수를 가리키기 때문에
		// (애시당초 C1에게는 width과 height라는 인스턴스 변수가 존재하지 않는다.)
		// C1의 폭과 높이에 대한 값만 변하는 것이 아닌, C2의 폭과 높이 또한 변한다.
		
		// 클래스 변수를 변경하는 것은
		// local pc의 폴더안에 있는 파일의 내용을 바꾸는 것이 아닌
		// 공용 폴더안에 있는 파일의 내용을 바꾸는 개념
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		
		
		
		//재귀호출
		int  n = 10;
		long result = 0;

		for(int i = 1; i <= n; i++) {
			result = FactorialTest2.factorial(i);
			//스텍 쌓이는거 참고
			
			
			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;
			}

			System.out.printf("%2d!=%20d%n", i, result);
		}
		
		
	} //main 끝
		
} //class 끝


//카드 예시 _ 클래스와 메서드의 변수
class Card {
	String kind ;				// 카드의 무늬 - 인스턴스 변수
	int number;				    // 카드의 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭  - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
} // card 클래스 끝



// 재귀호출
class FactorialTest2 {
	static long factorial(int n) {
		if(n<=0 || n>20) return -1;  // 매개변수의 유효성 검사.
		if(n<=1) 
			 return 1;
	    return n * factorial(n-1); 
	}
}
