package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
// static olmadan kullanım
//	public boolean isValid(Product product) {
//
//		if (product.price > 0 && !product.name.isEmpty()) {

//			return true;

//		} else {
//			return false;
//		}
//	}

	// static kullanımı
	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {

			return true;

		} else {

			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	public static class BaskaBirClass {
		public static void sil() {
			
		}
	}
	
}
	


