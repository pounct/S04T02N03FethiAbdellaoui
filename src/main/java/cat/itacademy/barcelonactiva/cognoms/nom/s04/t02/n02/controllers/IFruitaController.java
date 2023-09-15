package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.controllers;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities.Fruita;

public interface IFruitaController {
	
	void add(Fruita fruita);
	void update(Fruita fruita);
	void delete(String id);
	Optional<Fruita> getOne(String id);
	List<Fruita> getAll();

}
