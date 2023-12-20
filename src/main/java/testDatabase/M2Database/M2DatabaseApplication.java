package testDatabase.M2Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testDatabase.M2Database.service.MyService;

@SpringBootApplication
public class M2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(M2DatabaseApplication.class, args);

	}

}
