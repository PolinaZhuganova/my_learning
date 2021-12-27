package json_gson_parcers;

import dom_sax_parsing.Root;

/**
 * Класс Main_class
 */
public class Main_class {


	public static void main(String[] args) {

		//DomParser parser = new DomParser();
		//SaxMyParser parser = new SaxMyParser();
		//JsonSimpleParser parser = new JsonSimpleParser();

		GsonParser parser = new GsonParser();
		Root root = parser.parse();

		System.out.println("Root " + root.toString());


	}
}
