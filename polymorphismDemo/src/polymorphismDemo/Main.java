package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// polymorphism çok biçimlilik demek. Referans tiplerin birbirlerinin
		// referansını tutmasını sağlar. (inheritance yardımıyla)

		// EmailLogger logger = new EmailLogger();
		// logger.log("Log mesajı");

		//BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger(),
			//	new ConsoleLogger() };

		//for (BaseLogger logger : loggers) {

			//logger.log("Log mesajı");
	//}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

		

	}

}
