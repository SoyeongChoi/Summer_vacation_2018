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
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));// bufferedwriter�?
																							// ?��?��
																							// ?��?��받음
				if (file.isFile() && file.canWrite()) {// ?��?��?���?, ?�� ?�� ?��?���?
					Scanner input = new Scanner(System.in);// ?��?��받음
					bufferedWriter.write(input.nextLine());// ?��?��?�� ?��?��.
					bufferedWriter.close();// 버퍼 ?��?��?�� 종료?��?��
				}
				BufferedReader br = new BufferedReader(new FileReader(new File(cloader.getResource("al_180625/text.txt").getFile())));// br?��
																										// ?��?��?��
																										// ?��?��주고
																										// ?��?���?
				String a = br.readLine();
				System.out.println(a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	
	}
}
