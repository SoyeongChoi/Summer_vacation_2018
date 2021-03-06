package al_180627;
/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class freelancer {
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
			Answer = 0;
			int N = sc.nextInt();
			ArrayList<Integer> p = new ArrayList<Integer>();
			ArrayList<Integer> q = new ArrayList<Integer>();
			p.add(0);
			q.add(0);
			for (int i = 0; i < N; i++) {
				p.add(sc.nextInt());
			}
			for (int i = 0; i < N; i++) {
				q.add(sc.nextInt());
			}
			int reference[] = new int[N+1];
			reference[0]= 0;
			reference[1] = Math.max(p.get(1), q.get(1));
			for (int i = 2; i <= N; i++) {
				reference[i] = Math.max(reference[i-1]+p.get(i), reference[i-2]+q.get(i));
			}
			Answer = reference[N];
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