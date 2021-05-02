
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public void save(Customer customer) {
		
		if(PersonManager.isValid(customer.nationalId, customer.firstName)) {
			System.out.println("Veri taban�na " + customer.firstName + " m��terisi eklendi.");
		}else {
			System.out.println( customer.firstName + " isminde bir kay�t bulunmamaktad�r.");
		}
	}

}
