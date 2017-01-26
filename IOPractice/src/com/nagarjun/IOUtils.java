package com.nagarjun;

import java.io.File;
import java.io.FileFilter;

public class IOUtils {

	public void getFiles(String dir){
		File directory = new File(dir);
		if(!directory.exists()){
			System.out.println(String.format("directory %s doesnt exist ", dir));
			return ;
		}
		
		if(!directory.isDirectory()){
			System.out.println(String.format("Provided value %s is not a directory", dir));
			return;
		}
		
		File[] files = directory.listFiles(logFilefilter);
		for(File f : files){
			System.out.println(f.getName());
		}
	}
	
	FileFilter logFilefilter = new FileFilter(){
		@Override
		public boolean accept(File file) {
			if(file.getName().endsWith(".txt")){
				return true;
			}
			return false;
		}
	};
	
	public static void main(String[] args) {
		IOUtils utils = new IOUtils();
		utils.getFiles("F:\\CMD\\tempNew");
	}
}
