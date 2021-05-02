
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public void save(Customer customer) {
		
		if(PersonManager.isValid(customer.nationalId, customer.firstName)) {
			System.out.println("Veri tabanýna " + customer.firstName + " müþterisi eklendi.");
		}else {
			System.out.println( customer.firstName + " isminde bir kayýt bulunmamaktadýr.");
		}
	}

}
