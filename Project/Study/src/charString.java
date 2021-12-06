
public class charString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ex = "I Love U!";
		
		//length()
		//변수.length()
		//문자열의 길이를 저장하기 위한 메서드
		
		int len;	//길이를 저장하기 위한 변수
		len = ex.length();
		System.out.println(len);
		
		//charAt
		//사용 형식 : String 변수명.charAt(index)
		//문자열에서 해당 위치(Index)에 있는 문자열을 반환하는 메서드
		//index에는 띄어쓰기 또한 포함된다.
		//결과는 문자형인 char. index는 0부터 시작함을 주의
		
		char character;	//문자를 저장하기 위한 변수

		for(int i=0;i<=8;i++) {
			character = ex.charAt(i);
			System.out.println(character);
		}
		
		//indexOf
		//사용 형식 : String 변수명.indexOf(문자열);
		int index1,index2,index3;
		
		index1=ex.indexOf("I");
		index2=ex.indexOf("!");
		index3=ex.indexOf("Love");
		
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3); //"Love" 문자열의 시작 Index를 저장함
		
		
	}

}
