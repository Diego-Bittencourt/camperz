package app.camperz.camperz;

import app.camperz.camperz.spots.Spot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CamperzApplication {

	private static final Logger log = LoggerFactory.getLogger(CamperzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CamperzApplication.class, args);


	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Spot spot = new Spot( 1, "First spot", "2024-03-26", "Some random description.", "Nagoya");
			log.info("Spot: " + spot);
		};
	}


}
