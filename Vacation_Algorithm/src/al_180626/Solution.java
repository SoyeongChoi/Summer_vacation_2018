package al_180626;
/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;
import java.util.*;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
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
         // Answer = 0;
         /////////////////////////////////////////////////////////////////////////////////////////////
         int N = sc.nextInt();
         int k = sc.nextInt();
         int player[] = new int[N];
         for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            player[i] = x;
         }

         /////////////////////////////////////////////////////////////////////////////////////////////
         LinkedList<Integer> temp = new LinkedList<Integer>();
         temp.add(player[0]);
         int count = 0;
         for (int i = 0; i < N; i++) {
            count = 0;
            int size = temp.size();
            for (int p = 0; p < size; p++) {
               if (temp.get(p) - player[i] > k || temp.get(p) - player[i] <-k) {
                  temp.add(player[i]);
                  count++;
               }
            }
            if (count == 0) {
               Answer++;
            }
         }
         // Print the answer to standard output(screen).
         System.out.println("Case #" + (test_case + 1));
         System.out.println(Answer);
         Answer = 0;
      }
   }
}