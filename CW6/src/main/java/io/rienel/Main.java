package io.rienel;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * TODO ArMotozov
 *
 * @since 12/3/2022
 */
public class Main {
	public static void main(String[] args) {
		File fileObj = new File("test.txt");
		StringBuffer buffer = new StringBuffer();
		try (FileReader fileReader = new FileReader(fileObj)) {
			int readedSymbolCode;
			while ((readedSymbolCode = fileReader.read()) != -1) {
				buffer.append(Character.toString(readedSymbolCode));
			}
		} catch (IOException e) {
			// Do exception processing
		}
		System.out.println(buffer.toString());
	}
}