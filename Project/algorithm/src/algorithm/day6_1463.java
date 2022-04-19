package algorithm;
import java.util.*;

public class day6_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] temp = new int[ n+1 ];
		
		temp[1] = 0;
		
		for (int i = 2; i < temp.length; i++) {
			temp[i] = temp[i-1] +1;
			
			if (i % 3 ==0) {
				if(temp[i /3] +1 <temp[i]) {
					temp[i] = temp[i / 3] +1;
				}
			}
			
			if (i % 2 ==0) {
				if(temp[i / 2] +1 < temp[i]) {
					temp[i] = temp[i /2] +1;
				}
			}
		}
		System.out.println(temp[n]);
	}

}
