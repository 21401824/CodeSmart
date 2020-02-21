package dom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {

	public static void main(String[] args) {
		
		try(FileInputStream in=new FileInputStream("m.file")){
		ObjectInputStream ip=new ObjectInputStream(in);
		person p1=(person)ip.readObject();
		person p2=(person)ip.readObject();
		System.out.println(p1);
		System.out.println(p2);
		ip.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
