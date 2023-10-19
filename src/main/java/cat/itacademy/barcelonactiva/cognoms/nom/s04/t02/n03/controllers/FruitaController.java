package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
public class FruitaController implements IFruitaController {

	@Autowired
	FruitaService fruitaService;

	@PostMapping("/add")
	@Override
	public ResponseEntity<Fruita> add(@RequestBody Fruita fruita) {
		fruitaService.add(fruita);
		return new ResponseEntity<>(fruita, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	@Override
	public ResponseEntity<Fruita>  update(@RequestBody Fruita fruita) {
		// update fruita
		fruitaService.update(fruita);
		return new ResponseEntity<>(fruita, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id) {
		Optional<Fruita> fruita = fruitaService.getOne(id);
		if(!fruita.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		fruitaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

	@Override
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Fruita>  getOne(@PathVariable("id") String id) {
		Optional<Fruita> fruita = fruitaService.getOne(id);
		if(!fruita.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(fruita.get(), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	@Override
	public ResponseEntity<List<Fruita>> getAll() {
		
		List<Fruita> fruites=new ArrayList<>();
		// getAll Fruites
		fruitaService.getAll().forEach(fruites::add);
		if (fruites.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(fruites, HttpStatus.OK);
	}
}
