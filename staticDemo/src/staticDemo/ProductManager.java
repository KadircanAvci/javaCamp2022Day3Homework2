package staticDemo;

public class ProductManager {

	// isValid operasyonunu static tanımlanmadığında aşağıdaki gibi kullanılır.(new yapılır)

	// public void add(Product product) {

////		ProductValidator validator = new ProductValidator();

////		if (validator.isValid(product)) {

////			System.out.println("Eklendi");
////		} else {
////			System.out.println("Ürün bilgileri geçersizdir");
////		}

	// isValid operasyonunu static olarak tanımlarsak aşağıdaki gibi kullanabiliriz. (new yapmayız)
	public void add(Product product) {

		if (ProductValidator.isValid(product)) {

			System.out.println("Eklendi");

		} else {

			System.out.println("Ürün bilgileri geçersizdir");
		}
		
		
	}
	

}
