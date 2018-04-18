package VornamenGenerator;
//Der Standard Umfang von Java wird um die Klassen Scanner, ArrayList, Arrays, List und Random erweitert die sich in der Klasse Java.util befinden
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Namensgenerator {
	
	public static void main (String [] args) {
		
		//Schaffen einer Liste aus Strings für Männernamen und Frauennamen.
		List<String> men = Arrays.asList("Herbert", "Hans", "Joachim", "Peter", "Sebastian", "Lars", "Tim", "Christoph", "Philipp", "Markus", "Christopher", "Jan", "Batuhan", "Gregor", "Laurens", "Christian", "Max", "Kevin", "Helge", "Ralph","Adrian", "Pedro", "Mike", "Cornelius");

		List<String> women = Arrays.asList("Eileen", "Irina", "Carina", "Melina", "Katharina", "Lisa", "Petra", "Esther", "Julika", "Janna", "Paula", "Sybille", "Lena", "", "Julia", "Lissa", "Gabriele", "Kirsten", "Karen", "Marina", "Sabrina", "Milena", "Janina", "Meike", "Janice", "Alina");		
		
		//Aufforderung das Geschlecht für den ein Name ausgegeben werden soll einzugeben.
		System.out.println("Wenn der Name männlich sein soll geben Sie ein m ein. \n"
				+ "Wenn der Name weiblich sein soll geben Sie ein w ein");
		
		
		//Erzeugen eines Objekts der Klasse Scanne um den Tastaturinput einzulesen
		Scanner scanner = new Scanner(System.in);
		
		//Initialisieren des Random Generators.
		Random random = new Random();
		
		//Erzeugen einer Hilfsvariable für die While Schleife.
		boolean ask = true;

		//Die Schleife wird solange durchgegangen bis ein gültiges Geschlecht eingegeben wird.
		while(ask){
			
		//Der Variable "geschlecht" wird die letzte Eingabe aus dem Tastaturpuffer zugewiesen.
		String geschlecht = scanner.nextLine();
		
		
		/*Die If-Verzweigung prüft ob und wenn ja welches gültige Geschlecht eingegeben wurde.
		Ist das Geschlecht gültig, wird ein zufälliger Name, welcher mit Hilfe des Randomgenerators bestimmt wird ausgegeben, die Hilfsvariable ask auf false gesetzt und die while Schleife beendet*/
		if (geschlecht.equals("w")){
			String name = women.get(random.nextInt(women.size()));;  
			System.out.println("Ihr Name lautet: " +  name);
			ask = false;
		} 
		
		else if (geschlecht.equals("m")){
			String name = men.get(random.nextInt(men.size())) ;
			System.out.println("Ihr Name lautet: " +  name);
			ask = false;
		}
		
		else {
			System.out.println("Sie haben kein gültiges Geschlecht eingegeben.\n"
					+ "Bitte versuchen sie es nochmal!");
			 
		}
		
		}
	}

}
