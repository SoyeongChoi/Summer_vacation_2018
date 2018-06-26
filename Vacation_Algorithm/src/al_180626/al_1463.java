package al_180626;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Codeground
 * ���� �����ϱ�
 * N���� ������ �־����� �� ������������ ������ �� �Ʒ��� ���� �۾��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.

1. N���� ������ ������������ �����Ѵ�.
    (�������� :  ���� ���� �ʿ������� ū �������� ������ ����.)

2. ������ ���ڷ� �Ʒ��� ���� �۾��� �Ѵ�. Ai

3. A1 - A2 + A3 - A4 ... + A2i-1 - A2i

4. �� ���� ������� ����Ѵ�.

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
