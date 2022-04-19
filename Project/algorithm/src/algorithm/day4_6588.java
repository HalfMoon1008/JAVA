package algorithm;
import java.util.Scanner;


public class day4_6588 {

	public static void main(String[] args) {
		
		// n = a + b
		// n은 6 이상의 짝수, a,b는 (홀수&&소수)
		// n을 만드는 방법이 여러개일 경우, b-a가 가장 큰 값
		// 1000,000 이하의 수 대상
		// "n = a + b"의 형태로 출력
		// 0을 입력할 경우, 입력 종료
		// 조건을 충족하지 못 할 경우
		// Goldbach's conjecture is wrong.
		// 출력
		// 입력값이 홀수라면, "X"출력
		
		// 홀수 조건 = 2로 나눴을 때, 나머지가 1
		// 소수 조건 - 에라토스테네스의 체
		// 1. a와 b는 홀수&&소수 조건을 충족
		
		// 에라토스테네스의 체 1000000 이하의 소수 찾기
		Scanner sc = new Scanner(System.in);
		boolean[] primeFalse = new boolean[11];
		primeFalse[1] = true;
		
		for(int i=2; i<=10;i++) {
			if(primeFalse[i]==false){
				for(int j=i*2;j<=10;j+=i) {
					primeFalse[j]=true;
				}
			}
		}
		
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			int i;
			for(i=2;i<n;i++) {
				if(primeFalse[i]==false && primeFalse[n-i]==true) {
					System.out.println(n+"="+i+"+"+(n-i));
					break;
				}
			}
			
			if(i==0)
				System.out.println("Goldbach's conjecture is wrong.");
			
		}
		
		
		
		
	}

}
