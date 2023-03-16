package br.com.apisul.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static String readFile(String filePath) throws IOException {
		
		File file = new File(filePath);
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}

		br.close();
		return sb.toString();
	}
}
