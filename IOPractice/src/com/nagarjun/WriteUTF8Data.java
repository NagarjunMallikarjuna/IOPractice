package com.nagarjun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class WriteUTF8Data {

	public static void main(String[] args) {
		try{
			File fileDir = new File("F:\\CMD\\tempNew\\temp.txt");
			//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir),"UTF8"));
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir),"UTF8"));
			String str;
			
			while((str=in.readLine())!=null){
				System.out.println(str);
			}
			in.close();
			
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
