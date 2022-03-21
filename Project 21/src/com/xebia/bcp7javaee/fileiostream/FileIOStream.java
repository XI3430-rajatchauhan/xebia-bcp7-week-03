package com.xebia.bcp7javaee.fileiostream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) {
		FileInputStream fin=null;
		int track;
		try {
			fin=new FileInputStream("things.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		try {
			do {
				track=fin.read();
				System.out.print((char)track);
			}while(track!=-1);
		} catch(IOException e) {
			System.out.println("Cannot read file");
		}

	}

}
