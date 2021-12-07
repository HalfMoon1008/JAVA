package java_Jungsuk;

public class flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n===Overflow===");
		System.out.printf("[ byte  ] Max: %d, Overflow: %d \n", (byte)Byte.MAX_VALUE, (byte)(Byte.MAX_VALUE + 1));
		System.out.printf("[ short ] Max: %d, Overflow: %d \n", (short)Short.MAX_VALUE, (short)(Short.MAX_VALUE +1));
		System.out.printf("[ int   ] Max: %d, Overflow: %d \n", (int)Integer.MAX_VALUE, (int)(Integer.MAX_VALUE +1 ));
		System.out.printf("[ long  ] Max: %d, Overflow: %d \n", (long)Long.MAX_VALUE, (long)(Long.MAX_VALUE + 1 ));

		System.out.printf("[ float  + 1.0] Max: %.3e, Overflow: %.3e \n", (float)Float.MAX_VALUE, (float)(Float.MAX_VALUE + 1.0));
		System.out.printf("[ double + 1.0] Max: %.3e, Overflow: %.3e \n", (double)Double.MAX_VALUE, (double)(Double.MAX_VALUE + 1.0));
		
		System.out.printf("[ float  *1000] Max: %.3e, Overflow: %.3e \n", (float)Float.MAX_VALUE, (float)(Float.MAX_VALUE *1000.0));
		System.out.printf("[ double *1000] Max: %.3e, Overflow: %.3e \n", (double)Double.MAX_VALUE, (double)(Double.MAX_VALUE * 1000.0));
		
		
		System.out.println("\n\n===Underflow===");
		System.out.printf("[ byte  ] Min: %d, Underflow: %d \n", (byte)Byte.MIN_VALUE, (byte)(Byte.MIN_VALUE - 1));
		System.out.printf("[ short ] Min: %d, Underflow: %d \n", (short)Short.MIN_VALUE, (short)(Short.MIN_VALUE - 1));
		System.out.printf("[ int   ] Min: %d, Underflow: %d \n", (int)Integer.MIN_VALUE, (int)(Integer.MIN_VALUE - 1 ));
		System.out.printf("[ long  ] Min: %d, Underflow: %d \n", (long)Long.MIN_VALUE, (long)(Long.MIN_VALUE - 1 ));

		System.out.printf("[ float  - 1.0] Min: %.3e, Underflow: %.3e \n", (float)Float.MIN_VALUE, (float)(Float.MIN_VALUE - 1.0));
		System.out.printf("[ double - 1.0] Min: %.3e, Underflow: %.3e \n", (double)Double.MIN_VALUE, (double)(Double.MIN_VALUE - 1.0));
		
		System.out.printf("[ float  /] Min: %.3e, Underflow: %.3e \n", (float)Float.MIN_VALUE, (float)(Float.MIN_VALUE /1000.0));
		System.out.printf("[ double /] Min: %.3e, Underflow: %.3e \n", (double)Double.MIN_VALUE, (double)(Double.MIN_VALUE /1000.0));	

		// [출처] [C언어가 본] Java(자바)의 Overflow(오버플로우)|작성자 먼그옛날


	}

}
