package al_180626;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Codeground
 * 정수 정렬하기
 * N개의 정수가 주어졌을 때 오름차순으로 정렬한 후 아래와 같은 작업을 하는 프로그램을 작성하시오.

1. N개의 정수를 오름차순으로 정렬한다.
    (오름차순 :  값이 작은 쪽에서부터 큰 쪽으로의 순서를 말함.)

2. 정렬한 숫자로 아래와 같은 작업을 한다. Ai

3. A1 - A2 + A3 - A4 ... + A2i-1 - A2i

4. 위 식의 결과값을 출력한다.

 * */
public class al_1463 {

	static int Answer;

	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt,
		 * instead of standard(keyboard) input. To test your program, you may
		 * save input data in input.txt file, and call below method to read from
		 * the file when using nextInt() method. You may remove the comment
		 * symbols(//) in the below statement and use it. But before submission,
		 * you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));
		
		int T = sc.nextInt();
		
		for (int test_case = 0; test_case < T; test_case++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Answer= 0;
			for(int i = 0; i < N; i++){
				if(i%2 == 0){
					Answer+=a[i];
				}else{
					Answer-=a[i];
				}
			}
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The answer to the case will be
			 * stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

			// Print the answer to standard output(screen).
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
	
	
}
