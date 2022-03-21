package com.xebia.bcp7javaee.inputoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String name=reader.readLine();
		System.out.println(name);

	}

}
