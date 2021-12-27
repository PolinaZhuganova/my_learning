package dom_sax_parsing;

import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;


/**
 * Класс SaxParser
 */
public class SaxMyParser implements TagName {

	public Root parse(){

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SaxParserHandler handler = new SaxParserHandler();
		SAXParser parser = null;
		try {
			parser = factory.newSAXParser();
		} catch (Exception e) {
			System.out.println("Open sax parser error "+ e.toString());
			return null;
		}
		File file = new File("D:\\Developer\\MyLearning\\src\\main\\resources\\test.xml");
		try {
			parser.parse(file, handler);
		} catch (SAXException e) {
			System.out.println("Sax parsing error "+ e.toString());
			return null;

		} catch (IOException e) {
			System.out.println("IO parsing error "+ e.toString());
			return null;

		}


		return handler.getroot();
	}
}