

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "src.main")
@SpringBootApplication
public class RideMicroserviceRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideMicroserviceRestApiServerApplication.class, args);
	}

}
