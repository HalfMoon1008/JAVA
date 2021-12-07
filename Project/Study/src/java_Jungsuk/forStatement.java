package java_Jungsuk;

public class forStatement {

	public static void main(String[] args) {
		
		//for(int i=1, i<=9; i++)의 반복문에
		//loof1이라는 네이밍을 한 것
		loof1 :	for(int i =1; i <= 9; i++) {
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					if(j == 7) {
						break loof1;
						// 위의 조건인 if(j==7)이 충족될 경우,
						// loof1이라는 이름이 붙은 반복문을
						// break 한다.
					}
					System.out.println(i + "*" + j + " = " + i * j);
				}
		
		}
	}
}