package java_Jungsuk;

public class oopDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };

		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		t.draw(); // 삼각형을 그린다.
		c.draw(); // 원을 그린다.
		
		
		
		
		Deck d = new Deck();	   // 카드 한 벌(Deck)을 만든다.
		Card e = d.pick(0);	   // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(e); // System.out.println(c.toString());과 같다.

		d.shuffle();			   // 카드를 섞는다.
		e = d.pick(0);		   // 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(e);
	}

}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0);
	}

	String getXY() {
		return "(" + x + "," + y + ")"; // x와 y의 값을 문자열로 반환
	}
}

class Circle extends Shape {
	Point center; // 원의 원점좌표
	int r; // 반지름

	Circle() {
		this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];

	Triangle(Point[] p) {
		this.p = p;
	}

	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

class Deck {
	final int CARD_NUM = 52;	// 카드의 개수
	Card cardArr[] = new Card[CARD_NUM];  // Card객체 배열을 포함

	Deck () {	// Deck의 카드를 초기화한다.
		int i=0;

		for(int k=Card.KIND_MAX; k > 0; k--)
			for(int n=0; n < Card.NUM_MAX ; n++)
				cardArr[i++] = new Card(k, n+1);
	}

	Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}

	Card pick() {			// Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // 카드의 순서를 섞는다.
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);

			Card temp = cardArr[i];	
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝

// Card클래스
class Card {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX  = 13;	// 무늬별 카드 수

	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

		return "kind : " + kinds[this.kind] 
			+ ", number : " + numbers.charAt(this.number);
	} // toString()의 끝
} // Card클래스의 끝