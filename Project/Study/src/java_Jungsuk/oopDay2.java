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
		
		
		
		
		
		// 인자의 타입은 매개변수의 타입과 일치하거나 자동 형변환이 가능해야함
		// 기본형 매개변수는 변수의 값을 읽기만 할 수 있다.		_		주소를 몰라서 읽기만 가능
		// 참조형 매개변수는 변수의 값을 읽고 변경할 수 있다.	_		주소를 알아서 읽고 쓰기 가능
		// 반환타입이 참조형이라는 것은 메서드가 객체의 주소를 반환한다는 것을 의미
		
		// 재귀호출
		// 반복문보다 성능은 떨어지지만,
		// 논리적 간결함 때문에 사용한다.
		
		System.out.printf("\n[재귀호출]\n");
		int  n = 10;
		long result = 0;

		for(int i = 1; i <= n; i++) {
			result = FactorialTest2.factorial(i);
			//스텍 쌓이는거 참고
			
			//factorial
			//	n	:	1		result1	:	1	|	result1 = n * factorial(n-1)
			//	n	:	2		result2	:	1	|	result2 = n * result1
			//	n	:	3		result3	:	2	|	result3 = n * result2
			//	n	:	4		result4	:	6	|	result4 = n * result3
			
			
			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;
			}

			System.out.printf("%2d!=%20d%n", i, result);
		}
		
		
		
		
		
		// 모든 인스턴스에서 사용하는 변수에 static을 붙인다.
		// 클래스 변수(static)는 인스턴스 생성 없이 사용 가능하다.
		// 클래스 메서드(static)은 인스턴스 변수를 사용할 수 없다.
		// 메서드 내에 인스턴스 변수를 사용하지 않는다면 static을 붙이는걸 고려한다.
		// static 메서드에서는 인스턴스 메서드를 호출할 수 없다.
		
		System.out.printf("\n[클래스 메서드와 인스턴스 메서드]\n");
		// 클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));

		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
		
		
		
		
		// overloading
		// 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
		// 작업내용은 다르지만, 의미상 같은 작업일 때 사용한다.
		// ex) println의 경우, 출력한다는 의미는 동일하다.
		// 하지만 String, int, float 등등의 타입마다 각기 다른
		// 작업을 통해서 println을 해주어야 한다.
		// 이런 경우가, 작업 내용(String, int, float)등은 다르지만
		// 의미가 같은 작업임.
		// 만약 overload이 없다면, 우리는 기본형 타입에 따른
		// prinntln을 모두 외워야했을 것이다.
		
		// 사용 형식
		// add(int i, int n);
		// add(long i, int n);
		// add(int i, long i);
		
		// overloading의 조건
		// 1. 메서드 이름이 같아야한다.
		// 2. 매개변수의 개수 또는 타입이 달라야한다.
		// 3. 어떠한 타입에 넣는 것인지 명확하게 해줘야한다.
		// ex) add(5, 8L), add(4,9) add(3L, 5)
		
		
		System.out.printf("\n[오버로딩]\n");
		
		MyMath3 m = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:"    + m.add(3,3));
		System.out.println("mm.add(3L, 3) 결과: "  + m.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "  + m.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: " + m.add(3L,3L));

		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + m.add(a));
		
		
		
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






// Class Method, Instance Method
class MyMath2 {
	long a, b;
	
	// 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	// mm.add
	long add() 	    { return a + b; }  // a, b는 인스턴스변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }

	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	// MyMath2.add
	static long   add(long a, long b) 	   	 { return a + b; } // a, b는 지역변수
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)	 { return a * b; }
	static double divide(double a, double b) { return a / b; }
}






// Overloading
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}

	int add(int[] a) { // 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}