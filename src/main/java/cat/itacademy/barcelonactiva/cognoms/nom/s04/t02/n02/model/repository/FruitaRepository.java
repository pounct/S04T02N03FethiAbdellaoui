package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities.Fruita;

public interface FruitaRepository extends JpaRepository<Fruita, Long> {
	
	//public Fruita findByNom(String nom);

}
