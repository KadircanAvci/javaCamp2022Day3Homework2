package polymorphismDemo;

public class FileLogger extends BaseLogger{
	//override
	public void log(String message) {
		System.out.println("Logged to filed : " + message);
	}
}
