package algorithm;
import java.util.Scanner;
import java.util.*;

public class day4_6522_2 {

	public static void main(String[] args) {
		
	       Scanner scan = new Scanner(System.in);
	        final int N = 1000000;		//final을 통해서 int N의 값을 고정
	        boolean [] b = new boolean[N+1];	// b라는 이름의 참 혹은 거짓을 담은 리스트 생성
	        List<Integer> list = new ArrayList<>();	// list의 타입은 int. 홀수 소수를 담을 리스트 생성
	 
	        Arrays.fill(b, true);	//fill을 통해 배b의 모든 값을 true로 채움
	 
	        // 에라토스테네스의 체를 통한 소수 찾기 _ 백만의 소수 모두 찾아놓는 과정
	        for(int i=3; i*i <= N; i+=2) {
	            if(b[i]) //똑같은 배수를 돌 필요는 없다. i=4일 때 4의 배수는 2의 배수
	                for(int j=i*i; j<=N; j+=i)
	                    b[j] = false;
	        }
	        
	        // 남은 숫자(소수)들을 리스트에 추가
	        for(int i=3; i<=N; i+=2)
	            if(b[i])
	                list.add(i);
	 
	        while(true) {
	            int n = scan.nextInt();
	            if(n%2==1) {
	            	System.out.println("홀수 입력으로 인한 연산 종료");
	            	break;
	            }
	            boolean isWrong = true;
	            if(n==0) 
	                break;
	            for(int i=0; i<list.size(); i++)
	                if(b[n-list.get(i)]) {		//입력값 n - 리스트 안에 소수.  짝수 - 홀수 = 홀수 이기에, 나온 값에 대해서 홀수 검증은 하지 않아도 된다.
	                    System.out.println(n+ " = " + list.get(i) +" + " + (n-list.get(i)));
	                    isWrong = false;
	                    break;
	                }
	            if(isWrong) //입력만 정상적이라면 틀릴 경우는 사실 없다.
	                System.out.println("Goldbach's conjecture is wrong.");
	        }

	}
}
