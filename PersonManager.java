
public class PersonManager {

	static Person[] persons;
	
	public PersonManager(Person[] persons) {
		this.persons = persons;
	}
	
	public static boolean isValid(int nationalId, String firstName) {
		for(Person p : persons) {
			if(p.nationalId == nationalId && p.firstName == firstName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
