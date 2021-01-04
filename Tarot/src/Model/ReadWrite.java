package Model;

import java.io.*;

/**
 * Read and write a file
 * @author Stephanie PERAFAN
 *
 */
public class ReadWrite {
	
	/**
	 * Read file
	 * @param file the file to read
	 * @return readObject lines readed
	 */
	public static Object read(File file) {
		ObjectInputStream flow;
		Object readObject = null;
		
		try{
			flow = new ObjectInputStream(new FileInputStream(file));
			readObject = (Object)flow.readObject();
			flow.close();
		}
		
		catch(ClassNotFoundException parException){
			System.err.println(parException.toString());
			System.exit(1);
			
		}
		
		catch(IOException parException){
			System.err.println("Erreur lecture du fichier " + parException.toString());
			System.exit(1);
		}
		
		return readObject;
		
		
	}
	
	/**
	 * Write in the file
	 * @param file file where we write
	 * @param object object to write in the file
	 */
	public static void write(File file, Object object) {
		ObjectOutputStream flow = null;
		
		
		try{
			flow = new ObjectOutputStream(new FileOutputStream(file));
			flow.writeObject(object);
			flow.flush();
			flow.close();
		}
		
		catch(IOException parException){
			System.err.println("Erreur ecriture du fichier " + parException.toString());
			System.exit(1);
		}
	}

}
