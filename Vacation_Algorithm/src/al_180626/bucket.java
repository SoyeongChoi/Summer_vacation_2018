package al_180626;

/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;
import java.util.Stack;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
public class bucket {
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
			/////////////////////////////////////////////////////////////////////////////////////////////
				String a = sc.next();
				Stack<Character> s1 = new Stack<Character>();
				Stack<Character> s2 = new Stack<Character>();
				Stack<Character> s3 = new Stack<Character>();
				char[]temp = new char[a.length()];
				for(int i = 0; i <a.length();i++){
					temp[i] = a.charAt(i);
				}
				boolean a1 = true;
				boolean a2 = true;
				boolean a3 = true;
				int count = 0;
				for(int i = 0 ; i < temp.length; i++){
					if (temp[i] == '('){		
						s1.push('(');
						count++;
					}
					else if(temp[i] == ')'){
						if(!s1.empty()){
							s1.pop();
							Answer++;
							count = 0;
						}else{
							a1 = false;
						}
					}else if (count != 0){
						if(!s1.empty()){
							while(!s1.empty()){								
								s1.pop();
							}
							count = 0;
						}
					}
					if(temp[i] == '{'){
						s2.push('{');
						count++;
					}else if(temp[i] == '}'){
						if(!s2.empty()){
							s2.pop();
							Answer++;
							count = 0;
						}else{
							a2 = false;
						}
					}else if (count != 0){
						if(!s2.empty()){
							while(!s2.empty()){								
								s2.pop();
							}
							count = 0;
						}
					}
					if(temp[i]=='['){
						s3.push('[');
						count++;
					}else if(temp[i] == ']'){
						if(!s3.empty()){
							s3.pop();
							Answer++;
							count = 0;
						}else{
							a3 = false;
						}
					}else if (count != 0){
						if(!s3.empty()){
							while(!s3.empty()){								
								s3.pop();
							}
							count = 0;
						}
					}
				}
				System.out.println("Case #"+(test_case+1));
				System.out.println(Answer);
			}
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
		
		
	}
}