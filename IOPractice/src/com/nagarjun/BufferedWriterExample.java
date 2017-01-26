package com.nagarjun;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args){
		
		String content = "Hello world";
		File file = new File("F:\\CMD\\tempNew\\temp.txt");
		
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
