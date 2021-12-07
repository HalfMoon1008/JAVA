import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정의 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 사용 형식 : 데이터 타입 [] 변수 이름 : new 데이터 타입 [길이]
		// Ex)	int[] score : new int [5]
		//			선언부    |  생성부
		// score라는 배열을 선언하며, 해당 배열은 int형으로 5개의 길이가 들어가는 배열이다.
		
		//배열의 선언과 생성
		int [] ex1 = new int [5];
		
		//배열의 인덱스관계.
		//	0	|	1	|	2	|	3	|	4			-	Index번호
		//	10		20		30		40		50			-	Index의 내용물
		
		//배열의 초기화 방법 3가지
		//1) 하나하나 초기화하기
		ex1[0] = 10;
		ex1[1] = 20;
		ex1[2] = 30;
		ex1[3] = 40;
		ex1[4] = 50;
		
		
		//2) 생성과 동시에 초기화 하기
		int [] ex2 = new int[] {10,20,30,40,50};
		
		
		//3) for문을 이용해서 초기화 하기
		int [] ex3 = new int [5];
		for(int i=0; i<ex3.length; i++) {
			ex3[i] = (i+1)*10;
		}

		
		
		
		//배열과 메소드
		
		//저장값 확인하는 방법
			//for를 이용한 방법
			System.out.printf("[for를 이용한 배열의 값 확인]\n");
			for(int i=0; i<ex1.length; i++) {
				System.out.printf("%d ",ex1[i]);
			}
			//결과값 : 10 20 30 40 50 
		
			//Arrays.toString()를 사용하는 방법		_	배열의 모습을 확인하는 느낌
			System.out.printf("\n\n[Arrays.toString 이용한 배열의 값 확인]\n");
			System.out.println(Arrays.toString(ex1));
			//결과값 : [10, 20, 30, 40, 50]
		
		
		//배열 복사
			//for를 이용한 방법
			int [] score = new int[5];
			for(int i=0; i<score.length; i++){	//	score배열에 점수를 입력
				score[i] = 100 - (i*10);
			}
			
			int [] dupl = new int [score.length*2];	// 기존 배열보다 길이가 2배인 배열 생성
			for(int i=0; i<score.length; i++) {
				dupl[i] = score[i];			//	dupl 배열이 score 배열의 값을 그대로 이식
			}
			
			score = dupl;		//	참조변수 score이 dupl을 가리키게 한다.
			System.out.printf("\n[for를 이용한 배열 복사]\n");
			System.out.println(Arrays.toString(score));
			
			//System.arraycopy()를 이용한 복사
			//사용 형식 : System.arraycopy(참조 배열의 이름, 참조 배열의 복사 시작 인덱스, 목표 배열의 이름, 목표 배열의 복사 시작 인덱스, 복사할 배열 값의 수);
			int [] result = new int[5];
			for(int i=0; i<result.length; i++){	//	result에 랜덤으로 주사위 결과 입력
				result[i] = (int)(Math.random()*7)-1;
			}			
			
			int [] copyResult = new int [result.length*2];
			System.arraycopy(result, 0, copyResult, 0, result.length);
			//				result[0]에서 copyResult[0]으로 result.length개의 데이터를 복사하겠다.
			System.out.printf("\n[System.arraycopy() 이용한 배열 복사]\n");
			System.out.println(Arrays.toString(copyResult));
			
			
			//예제 1
			int [] test = new int[5];
			int [] test2 = new int [5];
			
			for(int i = 0; i<test.length; i++) {
				test[i] = (i+1)*20;
				test2[i] = (int)(Math.random()*-100)-1;
			}
			
			int [] test3 = new int[test.length*2];
			
			//예제 1-1
			System.arraycopy(test, 0, test3, 0, test.length);
			System.arraycopy(test2, 0, test3, test.length, test2.length);
			System.out.printf("\n[예제 1-1의 결과값]\n");
			System.out.println(Arrays.toString(test3));
			
			//예제 1-2
			System.arraycopy(test, 0, test2, 0, test.length);
			System.out.printf("\n[예제 1-2의 결과값]\n");
			System.out.println(Arrays.toString(test2));
			
			//예제 1-3			
			for(int i = 0; i<test2.length; i++) {	
				test2[i] = (int)(Math.random()*-100)-1;
			}//예제 1-3의 결과값 확인을 편하게 하기 위해서 test2의 값들을 음수로 바꿔줌
			
			System.arraycopy(test, 0, test2, 2, 2);
			System.out.printf("\n[예제 1-3의 결과값]\n");
			System.out.println(Arrays.toString(test2));

	}

}
