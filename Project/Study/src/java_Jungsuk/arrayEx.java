package java_Jungsuk;

import java.util.Arrays;

public class arrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//총합과 평균
			System.out.printf("총합과 평균\n");
			int sum =0;				// 총점을 저장하기 위한 변수
			float average = 0f;		// 평균을 저장하기 위한 변수
	
			int[] score = {100, 88, 100, 100, 90};
	
			for (int i=0; i < score.length ; i++ ) {
				sum += score[i];
			}
	
			average = sum / (float)score.length ; // 계산결과를 float로 얻기 위함.
	
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + average);
		
		
		
		//최대값과 최소값
			System.out.printf("\n최대값과 최소값 구하기\n");
			int[] randomNum = new int[6];
			for(int i = 0; i<randomNum.length; i++) {
				randomNum[i] = (int)(Math.random()*100)+1;
			}

			int max = randomNum[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다. 
			int min = randomNum[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다. 

			for(int i=1; i < randomNum.length;i++) {
				if(randomNum[i] > max) { 
					max = randomNum[i]; 
				} else if(randomNum[i] < min) { 
					min = randomNum[i]; 
				} 
			}

			System.out.println("최대값 :" + max);       
			System.out.println("최소값 :" + min);    
		
		
		
		//섞기
			System.out.printf("\n섞기\n");
			int[] numArr = new int[10];

			for (int i=0; i < numArr.length ; i++ ) {
	             numArr[i] = i;  // 배열을 0~9의 숫자로 초기화한다.
				System.out.print(numArr[i]);  
			}
			System.out.println();

			for (int i=0; i < 100; i++ ) {  //random에서 0~9의 숫자가 모두 나올 수 있게 충분히 반복해준다.
				int n = (int)(Math.random() * 10);	// 0~9중의 한 값을 임의로 얻는다.
				int tmp = numArr[0];
				numArr[0] = numArr[n];
				numArr[n] = tmp;
			}

			for (int i=0; i < numArr.length ; i++ )
				System.out.print(numArr[i]);	
		
		
		
		//로또 번호 생성
			System.out.printf("\n\n로또 번호 생성 _ 속도 테스트1\n");
			long st1 = System.nanoTime();		//코드 수행 시간 확인을 위한 시작 시점 체크 포인트
			
			int[] ball = new int[45];  // 45개의 정수값을 저장하기 위한 배열 생성.      
	
			// 배열의 각 요소에 1~45의 값을 저장한다. 
			for(int i=0; i < ball.length; i++)       
				ball[i] = i+1;    // ball[0]에 1이 저장된다.
	
			int tmp = 0;   // 두 값을 바꾸는데 사용할 임시변수 
			int j = 0;     // 임의의 값을 얻어서 저장할 변수 
	
			// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다. 
			// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
			for(int i=0; i < 6; i++) {       
				j = (int)(Math.random() * 45); // 0~44범위의 임의의 값을 얻는다. 
				tmp     = ball[i]; 
				ball[i] = ball[j];
				ball[j] = tmp; 
			} 
			
			long et1 = System.nanoTime();		//코드 수행 시간 확인을 위한 마지막 시점 체크 포인트

			      
			
			// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
			System.out.printf("이번주의 로또 번호 : ");
			for(int i=0; i < 6; i++){
				System.out.printf("%d ", ball[i]); 
			}
			
			long elapsedTime = et1 - st1;
			System.out.println("\n경과시간 : " + elapsedTime);
			
			
			
			
			
			System.out.printf("\n로또 번호 생성 _ 속도 테스트2\n");
			long st2 = System.nanoTime();		
		
			int[] ball2 = new int[45];       
	
			for(int i=0; i < ball2.length; i++)       
				ball2[i] = i+1;   
			
			int tmp2 = 0;   
			int j2 = 0;    
	
			for(int i=0; i < 6; i++) {       
				j2 = (int)(Math.random() * 45); 
				tmp2     = ball2[i]; 
				ball2[i] = ball2[j2];
				ball2[j2] = tmp2; 
			} 
			
			//현재 배열 ball은 index 0~5까지는 무작위로 섞고,
			//이후에는 불필요한 Index를 까지고 있다.
			//복사 과정을 통해서 배열의 수는 늘리지만, 공간을 줄일경우
			//속도에 영향을 미칠까? 메모리에 영향을 미치는지도 궁금하다... 측정 어떻게 하지...?
			int [] copyball2 = new int [ball2.length];
			System.arraycopy(ball2, 0, copyball2, 0, ball2.length);
			
			
			long et2 = System.nanoTime();		
			
			System.out.printf("이번주의 로또 번호 : ");
			for(int i=0; i < 6; i++){
				System.out.printf("%d ", ball2[i]); 
			}
			
			long elapsedTime2 = et2 - st2;
			System.out.println("\n경과시간 : " + elapsedTime2);
			
			
			
			
			
			System.out.printf("\n로또 번호 생성 _ 속도 테스트3\n");
			long st3 = System.nanoTime();
		
			int[] ball3 = new int[45];
			
			for(int i=0; i < ball3.length; i++)       
				ball3[i] = i+1; 
			
			int tmp3 = 0;   
			int j3 = 0;    
	
			for(int i=0; i < 6; i++) {       
				j3 = (int)(Math.random() * 45);  
				tmp3     = ball3[i]; 
				ball3[i] = ball3[j3];
				ball3[j3] = tmp3; 
			} 
			//속도 테스트2와 유사한 논리
			//하지만 이번에는 배열의 수를 늘리고, 값을 최적화(?) 한다는 개념보다는
			//참조변수 또한 복사한 배열을 가르키게 하고,
			//해당 행위가 영향이 있을지에 대해서 알아본다.
			int [] copyball3 = new int [ball3.length];
			for(int i=0; i<ball3.length; i++) {
				copyball3[i] = ball[i];			
			}
			
			ball3 = copyball3;
			
			
			long et3 = System.nanoTime();	
			
			System.out.printf("이번주의 로또 번호 : ");
			for(int i=0; i < 6; i++){
				System.out.printf("%d ", ball3[i]); 
			}
			
			long elapsedTime3 = et3 - st3;
			System.out.println("\n경과시간 : " + elapsedTime3);
			
			
			
			//테스트 결과
			//케이스2의 경우, 배열이 하나 더 추가되는 개념이라
			//메모리에 오히려 더 많은 데이터가 이게 돼서
			//시간이 더 걸리는 것으로 보인다.
			
			//케이스1과 케이스3은 속도가 유사한 것으로 판단된다.
			//흥미로운 부분은 케이스3에서 기존 배열의 참조변수를 복사한 배열로 바꾸는 것 만으로
			//속도가 늘어난 것으로 보인다.
			//즉슨, 기존 배열의 참조변수를 복사한 배열의 참조변수에  덮어쓰기 해주는 것이
			//전체적인 메모리의 기능에 영향을 미친 것같다.
			
			//하지만 성능에는 케이스1이 가장 빠른 모습을 보인다.
			//용량의 관점에서 불필요한 데이터값들을 정리해주는 행위가
			//오히려 하나의 과정을 만들기에 위와 같은 결과가 보이는 것으로 추측된다.
			
			//이후 JAVA와 컴퓨터에 대해서 더 잘 알게되면 다시 한번 테스트 해볼 것.
			
			
		//임의의 값으로 배열 채우기
			System.out.printf("\n임의의 값으로 배열 채우기\n");
			int[] code = { -4, -1, 3, 6, 11 };  // 불연속적인 값들로 구성된 배열
			int[] arr = new int[10];

			for (int i=0; i < arr.length ; i++ ) {
				int num = (int)(Math.random() * code.length);
				//Math.random() * code.length = 5
				//즉 num의 범위는 0~4이며, 이는 code[]의 index번호이다.
				arr[i] = code[num];
			}
			
			System.out.println(Arrays.toString(arr));
		
		
		//정렬하기
			System.out.printf("\n정렬하기\n");
			int[] numArr2 = new int[20];

			for (int i=0; i < numArr2.length ; i++ ) {
				numArr2[i] = (int)(Math.random() * 100)+1;
			}
			System.out.println(Arrays.toString(numArr2));
			System.out.println();

			for (int i=0; i < numArr2.length ; i++ ) {
				boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.

				for (int z=0; z < numArr2.length-1 ;z++) {
					if(numArr2[z] > numArr2[z+1]) { // 옆의 값이 작으면 서로 바꾼다.
						int temp = numArr2[z];
						numArr2[z] = numArr2[z+1];
						numArr2[z+1] = temp;
						changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
					}
				} // end for z

				if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.

				for(int k=0; k<numArr2.length;k++) {
					System.out.print(numArr2[k]+" "); // 정렬된 결과를 출력한다.
				}
				System.out.println();
			} // end for i
		
		
		//빈도수 구하기
			System.out.printf("\n빈도수 구하기\n");
			int[] numArr3  = new int[10];
			int[] counter = new int[10];

			for (int i=0; i < numArr3.length ; i++ ) {
				numArr3[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
				System.out.print(numArr3[i]+" ");
			}
			System.out.println();

			for (int i=0; i < numArr3.length ; i++ ) {
				counter[numArr3[i]]++;	
				//index값을 숫자 구분자로, 값을 카운터로 사용함
				//EX) count[numArr3[0]]++;
				//	  count[2]++;
				//Count의 배열 정보
				//	0	1	2	3	4	5	6	7	8	9	_	index
				//	0	0	1	0	0	0	0	0	0	0	_	값
			}

			for (int i=0; i < numArr3.length ; i++ ) {
				System.out.println( i +"의 개수 :"+ counter[i]);
			}
			
	}

}
