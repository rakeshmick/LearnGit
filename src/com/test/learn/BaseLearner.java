package com.test.learn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BaseLearner {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
=======
		
		 System.out.println("Pushing a change to master directly ");
		 System.out.println("this is after the other user made a branch from the master and started making changes");
>>>>>>> ad9e831082c272c5c7c7f625626aeeea543e1bba


		readMyFile();
	}

	public static void readMyFile() throws IOException {
		File file = new File("/Users/rakeshprabhakaran/Project/GitLearn/src/com/test/learn/gitRepoDetails.txt");
		FileReader fileReader  = new FileReader(file);
		char [] a = new char[100];
		fileReader.read(a);   // reads the content to the array
		for(char c : a) {
			 System.out.print(c);
		}
		fileReader.close();
	}

}
