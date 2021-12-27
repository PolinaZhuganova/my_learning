package json_gson_parcers;

import com.google.gson.Gson;
import dom_sax_parsing.Root;

import java.io.FileReader;

/**
 * Класс json_gson_parcers.GsonParser
 */
public class GsonParser {

	public Root parse() {

		Gson gson = new Gson();

		try (FileReader reader = new FileReader("D:\\Developer\\MyLearning\\src\\main\\resources\\test.json")) {

			Root root = gson.fromJson(reader, Root.class);
			return root;

		} catch (Exception e) {
			System.out.println("Parsing error " + e.toString());
		}

		return null;
	}
}