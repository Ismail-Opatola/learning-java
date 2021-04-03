package com.github.ismailopatola.learningjava.fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

// Logging
// -------
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import sun.util.logging.resources.logging;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/**
		 * Seraialization
		 * --------------
		 * A process of converting an object into a byte stream.
		 * + Persists (saves the state) the object after program exits
		 * + This byte stream can be saved as a file or sent over a network
		 * + can be sent to a different mechine
		 * + Byte stream can be saved as a file (.ser) which is platform independent
		 * (Think of this as if you're saving file with the object's information)
		 * 
		 * Deserialization
		 * ---------------
		 * The reverse process of converting a byte stream into an object.
		 * (Think of this as if your're loading a saved file)
		 * 
		 * 
		 * Steps to Serialization
		 * ----------------------
		 * 1. Your object class should implement Serializablr interface
		 * 2. add import java.io.Serializable;
		 * 3. FileOutputStream fileOut = new FileOutputStream(file path)
		 * 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 * 5. out.writeObject(objectName)
		 * 6. out.close(); fileOut.close();
		 * 
		 * Steps to Deserialization
		 * ----------------------
		 * 1. Eeclare your object (don't instantiate)
		 * 2. Your class should implement Serializable interface
		 * 2. add import java.io.Serializable;
		 * 3. FileOutputStream fileIn = new FileInputStream(file path)
		 * 4. ObjectOutputStream oin = new ObjectInputStream(fileIn);
		 * 5. in.writeObject(objectName)
		 * 6. in.close(); fileIn.close();
		 * 
		 * important notes
		 * ---------------
		 * 1. children classes of a parent class tate implements Serializable will do so as well
		 * 2. static fields are not serialized (they belong to the class, not an individual object)
		 * 3. the class's definitionk ("class file") itself is not recorded, cast it as the object type
		 * 4. Fields declared as "transient" aren't serialized, they're ignored
		 * 5. serialVersionUID is a unique version ID
		 *  
		 * serialVersionUID
		 * ---------------
		 * A unique ID that functions like a version #
		 * + verifies that the sender and receiver of a serialized object,
		 * have loaded classes for that object that match
		 * + ensures object will be compatible between machines
		 * + Number must match, otherwise this will cause an InvalidClassException
		 * + A SerialVersionID will be calculated based on class properties, 
		 * + A serializable class can declare its own serialversionID explicitly 
		 */
		
		User user = new User();
		user.nameString = "Bro";
		user.passwordString = "password123456";
		
		// SERIALIZE
		// ---------
		FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(user);
		
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Object Info saved!");
		
		// DESERIALIZE
		// ------------
		User userD = null;
		
		FileInputStream fileIn = new FileInputStream("UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		userD = (User) in.readObject();
		
		in.close();
		fileIn.close();

		System.out.println("UserInfo.ser deserialized!");
		System.out.println(userD.nameString);
		System.out.println(userD.passwordString);
		userD.sayHello();
		
		// serialVersionUID
		//-----------------
		
		long serialVersionUID = ObjectStreamClass.lookupAny(user.getClass()).getSerialVersionUID();
		System.out.println("serialVersionUID: " + serialVersionUID);
	}
}
