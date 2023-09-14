package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository.FruitaRepository;

@SpringBootApplication
public class S04T02N03GognomsNomApplication implements CommandLineRunner{
	
	@Autowired
	FruitaRepository fruitaRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03GognomsNomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		fruitaRepository.save(new Fruita(null,"fruita1",250));
		fruitaRepository.save(new Fruita(null,"fruita2",150));
		fruitaRepository.save(new Fruita(null,"fruita3",3500));
		List<Fruita> frts= fruitaRepository.findAll();
		frts.forEach((f)->System.out.println(f));
	}

}
