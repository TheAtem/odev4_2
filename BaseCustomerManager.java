
public abstract class BaseCustomerManager implements ICustomer {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri taban�na " + customer.firstName + " m��terisi eklendi.");
	}
	

}
