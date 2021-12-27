package dom_sax_parsing;

import java.util.List;

/**
 * Класс Root
 */
public class Root {

	private String name;
	private List<People> people;


	public String getName() {
		return name;
	}

	public List<People> getPeople() {
		return people;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setPeople(List<People> people) {
		this.people = people;
	}






	@Override
	public String toString() {
		return "Root{" +
			"name='" + name + '\'' +
			", people=" + people +
			'}';
	}
}