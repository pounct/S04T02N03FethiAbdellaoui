package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities.Fruita;

@RepositoryRestResource
public interface FruitaRepository extends MongoRepository<Fruita, String> {
	
	//public Fruita findByNom(String nom);

}
