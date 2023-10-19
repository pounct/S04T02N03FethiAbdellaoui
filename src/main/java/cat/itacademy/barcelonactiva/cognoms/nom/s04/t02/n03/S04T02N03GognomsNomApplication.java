package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.repository.FruitaRepository;

@SpringBootApplication
public class S04T02N03GognomsNomApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03GognomsNomApplication.class, args);
	}

	@Bean
	CommandLineRunner start(FruitaRepository fruitaRepository) {
		return args -> {
			fruitaRepository.save(new Fruita(null, "fruita1", 250));
			fruitaRepository.save(new Fruita(null, "fruita2", 150));
			fruitaRepository.save(new Fruita(null, "fruita3", 3500));
			List<Fruita> frts = fruitaRepository.findAll();
			frts.forEach((f) -> System.out.println(f));

		};

	}

}
