package com.nagarjun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContentToByteArrayExample {

	public static void main(String[] args) {
		File file = new File("F:\\CMD\\tempNew\\temp.txt");
		byte[] bfile = readContentIntoByteArray(file);
		System.out.println(bfile.toString());
	}
	
	private static byte[] readContentIntoByteArray(File file){
		FileInputStream fileInputStream  = null;
		byte[] bfile = new byte[(int) file.length()];
		
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bfile);
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bfile;
	}
}
