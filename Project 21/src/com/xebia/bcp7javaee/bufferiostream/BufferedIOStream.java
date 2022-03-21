package com.xebia.bcp7javaee.bufferiostream;
import java.io.*;
public class BufferedIOStream {

	public static void main(String[] args) {
		BufferedInputStream input=null;
		BufferedOutputStream output=null;
		try {
			input=new BufferedInputStream(new FileInputStream(name: "data.txt"));
			output=new BufferedOutputStream(new FileOutputStream(name: "newdata.txt"));
			for (int i=input.read();i!=-1;i=input.read()) {
				output.write(i);
			}
			output.flush();
		}catch (IOException ex) {
			System.out.println(ex);
		}finally {
			try {
				if (input !=null) {
					input.close();
				}
				if (output !=null) {
					output.close();
				}
			}catch (IOException ex) {
				System.out.println(ex);
			}
		}
	}
	

}
