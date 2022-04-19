package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.println("입력해주세요 : ");
		String text = br.readLine();
		String[] results = new String[text.length()];

		for (int i = 0; i < text.length(); i++) {
			results[i] = text.substring(i, text.length());
		}

		Arrays.sort(results); // 오름차순으로 배열 정렬

		for (int j = 0; j < results.length; j++) {
			bw.write(results[j]);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

}
