package json_gson_parcers;

import dom_sax_parsing.*;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

/**
 * Класс JsonSimpleParser
 */
public class JsonSimpleParser implements TagName {

	public Root parse() {

		Root root = new Root();
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader("D:\\Developer\\MyLearning\\src\\main\\resources\\test.json")) {

			JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

			String name = (String) rootJsonObject.get(TAG_NAME_MAIN);

			JSONArray peopleJsonArray = (JSONArray) rootJsonObject.get(TAG_PEOPLE);

			List<People>peopleList = new ArrayList<>();
			for(Object it:peopleJsonArray) {
				JSONObject peopleJsonObject = (JSONObject) it;

				String namePeople = (String) peopleJsonObject.get(TAG_NAME);
				int age = (Integer) peopleJsonObject.get(TAG_AGE);

				People people = new People(namePeople, age);
				peopleList.add(people);
			}
			root.setName(name);
			root.setPeople(peopleList);

			return root;

		} catch (Exception e) {
			System.out.println("Parsing error " + e.toString());

		}

		return null;
	}
}