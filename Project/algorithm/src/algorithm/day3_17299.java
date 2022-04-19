package algorithm;
import java.io.*;
import java.util.*;


public class day3_17299 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 일련의 숫자가주어졌을 때, 오른쪽에 있는 수 중에서 자기 자신보다 큰 수를 찾는 것
		// 3 5 2 7
		// 3 -> 5
		// 5 -> 7
		// 2 -> 7
		// 7 -> -1
		
		// 바로 오른쪽에 큰수가생기지 않은 수의 경우. 스텍에 넣는다.
		// 이후 진행을 해보고, 진행 숫자의 오큰수가 스텍에 있는 숫자보다 크면 스텍에 있는 수의 오큰수를 입력
		
		// loop1 - 0 ~ N-1
		// 루프의 조건
		// 스텍에 뭔가 있을 때 (Stack > 0)
		// Stack.tip()보다 현재 A(i)가 더 크다면 오큰수를 저장
		// => 오른쪽 수가 오큰수가 아니라면 스텍에 넣고
		// 오큰수라면 스택의 값들을 Stack.pop하고 저장
		// 가장 큰 수의 경우, 마지막에는 Stack안의 수가 없고, 배열이 진행되지 않을 대 -1
		
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수열 A의 크기 N
        int N = Integer.parseInt(br.readLine());

        // 수열 A의 원소를 저장할 배열
        String[] strArray = br.readLine().split(" ");

        // strArray에 저장된 문자열을 숫자로 변경하기 위한 배열 A
        int[] A = new int[strArray.length];

        // A의 배열안에 숫자의 개수를 저장할 배열 F
        int[] F = new int[1000000];

        // strArray의 데이터를 숫자로 변경, F배열에 각 숫자의 인덱스에 맞는 값을 증가
        for (int i = 0; i < strArray.length; i++) {
            A[i] = Integer.parseInt(strArray[i]);
            F[(A[i] - 1)] = F[(A[i] - 1)] + 1;
        }

        // 스택 선언
        Stack < Integer > stack = new Stack < > ();

        // A의 길이만큼 반복문 수행
        for (int i = 0; i < A.length; i++) {
            // 스택이 비어있지 않고, F배열의 인덱스를 비교하여 클 경우 A배열의 데이터를 현재 값으로 변경
            while (!stack.isEmpty() && F[(A[stack.peek()] - 1)] < F[(A[i] - 1)]) {
                A[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        // 그외의 경우 -1저장
        while (!stack.isEmpty()) {
            A[stack.pop()] = -1;
        }

        // 시간초과를 해결하기 위한 StringBuilder선언
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            sb.append(A[i] + " ");
        }

        // 결과문 출력
        System.out.println(sb);
	}

}
