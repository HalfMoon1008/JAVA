package algorithm;
import java.util.*;

public class day6_1463_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 배열
        int[] table = new int[x+1];
        table[0] = 0;
        table[1] = 0;   // 연산이 필요없으니 0으로 대입

        // 2부터 X까지
        for(int i=2; i<x+1; i++) {
            // 최댓값으로 초기화하면 min 함수에서 자연스레 나눠 떨어지지 않는 경우를 제외할 수 있다. 
            int div3 = Integer.MAX_VALUE;   // 3으로 나누는 연산을 했을 때 총 연산 횟수
            int div2 = Integer.MAX_VALUE;   // 2로 나누는 연산을 했을 때 총 연산 횟수
            int minus1 = Integer.MAX_VALUE; // 1을 빼는 연산을 했을 때 총 연산 횟수

            if(i%3 == 0) div3 = table[i/3] + 1;
            if(i%2 == 0) div2 = table[i/2] + 1;
            minus1 = table[i-1] + 1;

            table[i] = Math.min(minus1, Math.min(div3, div2));
        }
        // 결과 출력
        System.out.print(table[x]);
	}

}
