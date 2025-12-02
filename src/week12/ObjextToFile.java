package week12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjextToFile {

	public static void main(String[] args) {
		Person person = new Person("Melvin Timothy", 22, "Universitas Multimedia Nusantara");
		
		try(FileOutputStream fileOut = new FileOutputStream("person.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)){
			out.writeObject(person);
			System.out.println("Serialized data is saved in person.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}