
public class mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		Math.random() : 0.0 ~ 1보다 작은 임의의 실수를 생성
	    System.out.println(Math.random());
	    		System.out.println((int)(Math.random()));   =>  int형 변환할 떄 () 위치 확인
	        		System.out.println((int)(Math.random()*10));  =>  0 ~ 9
	         		System.out.println((int)(Math.random()*10+1));    =>    1 ~ 10

	            최댓값 규칙 :
	              100을 곱할 경우, 0 ~ 99가 나오고,
	              1000을 곱할 경우, 0 ~ 999가 나온다.
	              이를 일반화 했을 때, '최댓값 : 곱한 값 - 1' 이라는 것을 알 수 있다.

	            최솟값 규칙
	              Math.random()*100 = 0 ~ 99까지의 숫자가 나온다.
	              여기에서 Math.random()*100을 묶고, +1을 해준다면
	              (Math.random()*100)+1 = 1 ~ 100 까지의 숫자가 나오게 된다.
	              때문에 최솟값을 설정하기 위해서는 Math.random을 묶은 뒤,
	              '+ X'를 해주면 된다. 
	     */
		
        // 활용 예시1 _ 주사위 눈금 구하기 (1~6)
        int num1 = (int)(Math.random()*6)+1;
        System.out.println("주사위 눈금 : " + num1);
		
        // 활용 예시2 _ 무작위 대문자 구하기
        char al = (char)(Math.random()*26+'A');
        System.out.println("무작위 대문자 : " + al);

        // 활용 시3 _ 무작위 소문자 구하기
        char al2 = (char)(Math.random()*26+'a');
        System.out.println("무작위 대문자 : " + al2);
	}

}
