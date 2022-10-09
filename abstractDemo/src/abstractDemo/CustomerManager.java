package abstractDemo;

public class CustomerManager {
	
	//Strategy pattern
	BaseDatabaseManager baseDatabaseManager;
	
	
	public void getCustomers() {
		baseDatabaseManager.getData();
		
	}
}
