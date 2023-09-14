package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository.FruitaRepository;

@RestController
public class FruitaController implements IFruitaController {

	@Autowired
	FruitaRepository fruitaRepository;

	@PostMapping("/fruita/add")
	@Override
	public void add(@RequestBody Fruita fruita) {
		// add fruita
		fruitaRepository.save(fruita);
	}

	@PutMapping("/fruita/update")
	@Override
	public void update(@RequestBody Fruita fruita) {
		// update fruita
		fruitaRepository.save(fruita);
	}

	@DeleteMapping("/fruita/delete/{id}")
	@Override
	public void delete(@PathVariable("id") Long id) {
		// delete fruita
		fruitaRepository.deleteById(id);
	}

	@Override
	@GetMapping("/fruita/getOne/{id}")
	public Optional<Fruita> getOne(@PathVariable("id") Long id) {
		return fruitaRepository.findById(id);
	}

	@GetMapping("/fruita/getAll")
	@Override
	public List<Fruita> getAll() {
		// getAll Fruites
		return fruitaRepository.findAll();
	}

}
