package com.nagarjun;

import java.io.File;
import java.io.IOException;

public class TemporaryFileExample {

	public static void main(String[] args) {
		File temp;
		try {
			temp = File.createTempFile("mytempfile", ".txt");
			System.out.println("temp file created:  "+temp.getAbsolutePath());
			
			temp.deleteOnExit();
			System.out.println("temp file is deleted : "+ temp.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
