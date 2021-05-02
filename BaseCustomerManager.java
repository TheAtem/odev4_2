
public abstract class BaseCustomerManager implements ICustomer {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanýna " + customer.firstName + " müþterisi eklendi.");
	}
	

}
