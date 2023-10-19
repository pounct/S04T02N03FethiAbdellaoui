package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.repository.FruitaRepository;

@Service
public class FruitaService implements IFruitaService{

	@Autowired
	FruitaRepository fruitaRepository;

	
	@Override
	public void add(Fruita fruita) {
		fruitaRepository.save(fruita);
	}
	@Override
	public void update(Fruita fruita) {
		fruitaRepository.save(fruita);
	}
	@Override
	public void delete(String id) {
		fruitaRepository.deleteById(id);
	}
	@Override
	public Optional<Fruita> getOne(String id) {
		return fruitaRepository.findById(id);
	}
	@Override
	public List<Fruita> getAll() {
		return fruitaRepository.findAll();
	}
}
