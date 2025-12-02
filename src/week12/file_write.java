package week12;

import java.io.FileWriter;
import java.io.IOException;

public class file_write {
	public static void main(String[] args) {
		try {
			FileWriter Writer
			    = new FileWriter("myfile.txt");
			Writer.write("Nama saya Melvin Timothy\n");
			Writer.write("Saya dari Universitas Multimedia Nusantara");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}
	}
}