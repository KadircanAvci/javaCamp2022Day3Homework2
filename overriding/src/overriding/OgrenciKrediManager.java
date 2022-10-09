package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	// overridin. Aynı imzayla yazdığımız için buradaki hesapla çalıştı. "final" keywordü ile overriding engellenebilir.
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
