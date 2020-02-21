package dom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class wrtObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person Mfundo=new person(5,"Ntokozo");
		person Ntokozo=new person(4,"Mfundo");
		
		System.out.println(Mfundo);
		System.out.println(Ntokozo);
		try(FileOutputStream fs=new FileOutputStream("m.file")){
			ObjectOutputStream ob=new ObjectOutputStream(fs);
			ob.writeObject(Ntokozo);
			ob.writeObject(Mfundo);
			
			ob.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}{
			
		}

	}

}
