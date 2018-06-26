package al_180625;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class al_11718 {
	public static void main(String[] args) {
		   ClassLoader cloader = al_11718.class.getClassLoader();
	          
		File file;
		while(true){
			try {
				file = new File(cloader.getResource("al_180625/text.txt").getFile());
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));// bufferedwriterë¥?
																							// ?†µ?•´
																							// ?…? ¥ë°›ìŒ
				if (file.isFile() && file.canWrite()) {// ?ŒŒ?¼?´ê³?, ?“¸ ?ˆ˜ ?ˆ?œ¼ë©?
					Scanner input = new Scanner(System.in);// ?…? ¥ë°›ìŒ
					bufferedWriter.write(input.nextLine());// ?ŒŒ?¼?— ?“´?‹¤.
					bufferedWriter.close();// ë²„í¼ ?‹«?•„?„œ ì¢…ë£Œ?‹œ?‚´
				}
				BufferedReader br = new BufferedReader(new FileReader(new File(cloader.getResource("al_180625/text.txt").getFile())));// br?—
																										// ?ŒŒ?¼?„
																										// ?„£?–´ì£¼ê³ 
																										// ?½?–´ì¤?
				String a = br.readLine();
				System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	
	}
}
