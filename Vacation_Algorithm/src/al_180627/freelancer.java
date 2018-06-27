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

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			 Answer = 0;
			int N = sc.nextInt();
			ArrayList<Integer> p = new ArrayList<Integer>();
			ArrayList<Integer> q = new ArrayList<Integer>();
			
			for(int i = 0; i < N; i++){
				p.add(sc.nextInt());
			}
			for(int i = 0; i < N; i++){
				q.add(sc.nextInt());
			}
			int q_max = (int) Collections.max(q);
			for(int i = 0; i < N; i+=2){
				int p_val = p.get(i)+p.get(i+1);
				int q_val = q.get(i+1);
				if(p_val> q_val){
					Answer+=p_val;
				}else{
					Answer+=q_val;
				}
			}
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}