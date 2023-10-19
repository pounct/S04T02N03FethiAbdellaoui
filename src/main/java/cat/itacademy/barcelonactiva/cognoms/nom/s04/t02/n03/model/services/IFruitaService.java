package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.Fruita;

public interface IFruitaService {
	
	void add(Fruita fruita);
	void update(Fruita fruita);
	void delete(String id);
	Optional<Fruita> getOne(String id);
	List<Fruita> getAll();

}
