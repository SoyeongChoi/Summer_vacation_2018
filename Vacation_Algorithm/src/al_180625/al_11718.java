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
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));// bufferedwriterλ₯?
																							// ?΅?΄
																							// ?? ₯λ°μ
				if (file.isFile() && file.canWrite()) {// ??Ό?΄κ³?, ?Έ ? ??Όλ©?
					Scanner input = new Scanner(System.in);// ?? ₯λ°μ
					bufferedWriter.write(input.nextLine());// ??Ό? ?΄?€.
					bufferedWriter.close();// λ²νΌ ?«?? μ’λ£??΄
				}
				BufferedReader br = new BufferedReader(new FileReader(new File(cloader.getResource("al_180625/text.txt").getFile())));// br?
																										// ??Ό?
																										// ?£?΄μ£Όκ³ 
																										// ?½?΄μ€?
				String a = br.readLine();
				System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	
	}
}
