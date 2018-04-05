package assignments;

import java.util.Vector;
import java.util.Enumeration;
import java.awt.Button;
import java.awt.Color;

public class VectorDemo {
	public static void main(String args[]) {
		Object objects[] = new Object[5];
		objects[0] = new Integer(8);
		objects[1] = new Float(35.4);
		objects[2] = new Boolean(true);
		objects[3] = new String("Hi There");
		objects[4] = new Button("Hello");
		for(int i=0; i<objects.length; i++)  {
			System.out.println("object " + i + ": " + objects[i].toString());
		}
		
		Vector vector = new Vector();
		for(int i=0; i<objects.length; i++)  {
			vector.addElement(objects[i]);
		}
		vector.addElement(Color.RED);
		System.out.println("Vector size: " + vector.size());
		for(int i=0; i<vector.size(); i++)  {
			System.out.println("element " + i + ": " + vector.elementAt(i).toString());
		}
		
		
		for(Object element : vector) {
			System.out.println("element: " + element.toString());
		}
		
		Enumeration vEnum = vector.elements();
		while(vEnum.hasMoreElements()) {
			System.out.println("element: " + vEnum.nextElement().toString());
		}
	}
}