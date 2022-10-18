package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriterBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good aftrernoon", "Good night"};
		
		String path = "C:\\Users\\lucca.macedo\\Desktop\\Lucca\\apoioAulasUdemy\\Seçao 17 - Arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
	}
}