package java_Jungsuk;

import java.util.Scanner;

public class arrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//좌표에 X표하기 20~
		System.out.printf("[좌표에 x표 하기]\n");
			final int SIZE = 10;
			int x = 0, y = 0;
	
			char[][] board = new char[SIZE][SIZE];
			byte[][] shipBoard = {
			  //  1  2  3  4  5  6  7  8  9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
			};
	
		     // 0행에 행번호를, 0열에 열번호를 저장한다. 
			for(int i=1;i<SIZE;i++)
				board[0][i] = board[i][0] = (char)(i+'0');
	
			Scanner scanner = new Scanner(System.in);
	
			while(true) {
				System.out.printf("좌표를 입력하세요.(종료는 00)>");
				String input = scanner.nextLine(); // 화면입력받은 내용을 tmp에 저장
	
				if(input.length()==2) {   // 두 글자를 입력한 경우
					x = input.charAt(0) - '0';  // 문자를 숫자로 변환
					y = input.charAt(1) - '0';
	
					if(x==0 && y==0) // x와 y가 모두 0인 경우 종료
						break; 
				} 
				
				if(input.length()!=2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE){
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					continue;
				}
	
				// shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.  
				board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';  
	
				// 배열 board의 내용을 화면에 출력한다.
				for(int i=0;i<SIZE;i++) {
					System.out.println(board[i]); // board[i]는 1차원 배열
				}
				System.out.println();
			}
			
			
			
			
		//빙고
			System.out.printf("\n[빙고]\n");
			final int SIZE1 = 5;
			int x1 = 0 , y1 = 0;
			int num = 0;

			int[][] bingo = new int[SIZE1][SIZE1];
			Scanner scanner1 = new Scanner(System.in);

			// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
			for(int i=0;i<SIZE1;i++) {
				for(int j=0;j<SIZE1;j++) {
					bingo[i][j] = i*SIZE1 + j + 1;
				}
			}

			// 배열에 저장된 값을 뒤섞는다.(shuffle)
			for(int i=0;i<SIZE1;i++) {
				for(int j=0;j<SIZE1;j++) {
					x1 = (int)(Math.random() * SIZE1);
					y1 = (int)(Math.random() * SIZE1);

					// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
					int tmp =  bingo[i][j];
					bingo[i][j] = bingo[x1][y1];
					bingo[x1][y1] = tmp;
				}
			}

			do {
				for(int i=0;i<SIZE1;i++) {
					for(int j=0;j<SIZE1;j++)
						System.out.printf("%2d ", bingo[i][j]);	
					System.out.println();
				}
				System.out.println();
			
				System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE1*SIZE1);
				String tmp = scanner1.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp);     // 입력받은 문자열(tmp)를 숫자로 변환

				// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
				outer:
				for(int i=0;i<SIZE1;i++) {
					for(int j=0;j<SIZE1;j++) {
						if(bingo[i][j]==num) {
							bingo[i][j] = 0;
							break outer; // 2중 반복문을 벗어난다.
						}
					}
				}
			} while(num!=0); 
			
			
			
		//행렬의 곱셈
			System.out.printf("\n[행렬의 곱셈]\n");
			int[][] m1 = {
					{1, 2, 3},
					{4, 5, 6}
				};

				int[][] m2 = {
					{1, 2},
					{3, 4},
					{5, 6}
				};

				final int ROW    = m1.length;      // m1의 행길이
				final int COL    = m2[0].length;  // m2의 열길이
				final int M2_ROW = m2.length;	    // m2의 행길이

				int[][] m3 = new int[ROW][COL];

			   // 행렬곱 m1 x m2의 결과를 m3에 저장
				for(int i=0;i<ROW;i++)
					for(int j=0;j<COL;j++)
						for(int k=0;k<M2_ROW;k++)
							m3[i][j] += m1[i][k] * m2[k][j]; 
							//int [] [] m3 ={ 
							//					{1+6+15}  {2+8+18}
							//					{4+15+30} {8+20+36)
							//				}
				
				
			   // 행렬 m3를 출력 
				for(int i=0;i<ROW;i++) {
					for(int j=0;j<COL;j++) {
						System.out.printf("%3d ", m3[i][j]);
					}
					System.out.println();
				}
			
			
			
			
		//단어 맞추기
				System.out.printf("\n[단어 맞추기]\n");
				String[][] words = {
						{"chair","의자"},			// words[0][0], words[0][1]
						{"computer","컴퓨터"},	// words[1][0], words[1][1]
						{"integer","정수"}		// words[2][0], words[2][1]
					};

					Scanner scanner3 = new Scanner(System.in);

					for(int i=0;i<words.length;i++) {
						System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

						String tmp = scanner3.nextLine();

						if(tmp.equals(words[i][1])) {
							System.out.printf("정답입니다.%n%n");
						} else {
						   System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
						}
					} // for
	}

}
