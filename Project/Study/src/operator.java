
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리 연산자
		// && (and) 조건일 경우, 모든 조건이 참일 때 true
		// 나머지는 false
		
		// || (or) 조건일 경우, 둘 중 하나라도 참일 때 true
		// 모두 거짓일 때, false
		
		
		// 삼항 연산자
		// -(조건) ? true 식1 : false 식2
		
	  	String result;
			char rch;
			
			rch = (char)(Math.random()*128);
			
			result = (rch>='A' && rch<='Z')||(rch>='a' && rch<='z') ? "알파벳입니다." : "알파벳이 아닙니다.";
			System.out.println(rch+"은(는)"+result);

		
	}

}
