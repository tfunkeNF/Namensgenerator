package VornamenGenerator;

//Import meiner enum Klasse um das Geschlecht setzen zu können
import VornamenGenerator.Name.Geschlecht;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Namensgenerator {
	
	public static void main (String [] args) {
		//Erzeugen des ersten Objekts
		Name name1;
		int laenge;
		name1 = new Name();
		List<Name> men = new ArrayList<Name>();
		
		name1.vorname = "Peter";
		name1.geschlecht= Geschlecht.MALE;
		//laenge = name1.vorname.length();
	//	System.out.println(laenge);
				
	}

}
