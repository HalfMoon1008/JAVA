
public class aboutCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		//강제 형변환
	    long l = 12349999L;
	    int i = (int)l;
	    System.out.println("Long to Integer: "+i);

	    short sh = (short)(i + 1);		//int형 변수 i에 10을 더한 값의 자료형은 int이다.
	    System.out.println("Integer to Short: "+ sh);
	    
	    
	    //강제 형변환 _ 정수  ⟺  실수
	    int i1 = 40;
	    double d = (double)i1;
	    System.out.println("Integer to Double: "+d);

	    float f = (float) 3.65;
	    short sh1 = (short)f;
	    System.out.println("Float to Short: "+sh1);
	    
	    
	    //자동 형변환 _ 강제 형변환을 하지 않아도 컴파일러가 자동으로 형변환하는 것
	    //규칙 : byte → short & char → int → long → float → double
	    //손상이 가지 않는 방향으로 형변환되는 것이 규칙
	    short sho = 10;
	    int in = sho + 10;			//sh+10은 short형 값인데 int형 변수 i에 저장
	    System.out.println("Casting to Integer: "+i);

	    long lo = in+4;				// i+4는 int형 값인데 long형 변수 l에 저장
	    System.out.println("Casting to Long: "+l);
	}

}
