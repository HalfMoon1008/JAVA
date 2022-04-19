package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class day1_stack {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>(); //스택 구현

        for (int i = 0; i < n; i++) { //n번만큼
            st = new StringTokenizer(bf.readLine(), " "); //이후 문장 받아오기

            switch (st.nextToken()) {
                case ("push"): 
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case ("pop"):
                    if (stack.isEmpty()) { //비어있으면 pop > -1출력
                        sb.append("-1"+"\n");
                        break;
                    } else { //아니면 pop값 출력
                        sb.append(stack.pop()+"\n");
                        break;
                    }
                case ("size"):
                    sb.append(stack.size()+"\n"); //stack size출력
                    break;
                case ("empty"):
                    if (stack.isEmpty()) { //비어있으면 1
                        sb.append("1"+"\n");
                        break;
                    } else { //아니면 0
                        sb.append("0"+"\n");
                        break;
                    }
                case ("top"):
                    if (stack.isEmpty()) {
                        sb.append("-1"+"\n");
                        break;
                    } else {
                        sb.append(stack.peek()+"\n"); //비어있지 않으면 꺼내지않고 값만 보기
                    }
            }
        }
        System.out.println(sb);
	}

}
