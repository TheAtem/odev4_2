
public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person(1, "Hakan", "Y�lmaz", "1990");
		Person person2  = new Person(2, "Volkan", "Y�lmaz", "1989");
		Person person3  = new Person(3, "Serkan", "Y�lmaz", "1995");
		Person person4  = new Person(4, "Mehmet Can", "Y�lmaz", "1993");
		
		Person person5  = new Person(5, "Cem", "Y�lmaz", "1990");
		Person person6  = new Person(6, "Gizem", "Y�lmaz", "1989");
		Person person7  = new Person(7, "Kubilay", "Y�lmaz", "1995");
		Person person8  = new Person(8, "Bade", "Y�lmaz", "1993");
		
		Person[] persons = {person1, person2, person3, person4, person5, person6, person7, person8};
		PersonManager personManager = new PersonManager(persons);
		
		BaseCustomerManager starbucks = new StarbucksCustomerManager();
		BaseCustomerManager nero = new NeroCustomerManager();
		
		Customer customer1 = new Customer(1, "Hakan", "Y�lmaz", "1990",1);
		Customer customer2  = new Customer(2, "Volkan", "Y�lmaz", "1989",2);
		Customer customer3  = new Customer(3, "Serkan", "Y�lmaz", "1995",3);
		Customer customer4  = new Customer(4, "Mehmet Can", "Y�lmaz", "1993",4);
		
		Customer customer5  = new Customer(5, "Cem", "Y�lmaz", "1990",5);
		Customer customer6  = new Customer(6, "Gizem", "Y�lmaz", "1989",6);
		Customer customer7  = new Customer(7, "Kubilay", "Y�lmaz", "1995",7);
		Customer customer8  = new Customer(8, "Bade", "Y�lmaz", "1993",8);
		Customer customer9  = new Customer(9, "I��l", "Y�lmaz", "1993",9);
		
		starbucks.save(customer9);
		nero.save(customer1);
	}

}
