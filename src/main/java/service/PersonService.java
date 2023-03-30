package service;
import java.util.HashMap;

public class PersonService {
	public static String yellAtPerson(HashMap personMap ) {
		String name = personMap.get("name").toString();
		return "Hey " + name+ "!!!";
	}
}
