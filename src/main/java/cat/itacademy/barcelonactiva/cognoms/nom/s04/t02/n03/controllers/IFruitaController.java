package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.Fruita;

public interface IFruitaController {

	ResponseEntity<Fruita> add(Fruita fruita);

	ResponseEntity<Fruita> update(Fruita fruita);

	ResponseEntity<HttpStatus> delete(String id);

	ResponseEntity<Fruita> getOne(String id);

	ResponseEntity<List<Fruita>> getAll();

}
