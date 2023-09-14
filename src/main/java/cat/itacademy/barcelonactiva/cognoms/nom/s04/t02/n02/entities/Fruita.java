package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "products")
public class Fruita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int quantitatQuilos;
	
	public Fruita() {
		super();
	}
	public Fruita(Long id, String nom, int quantitatQuilos) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	@Override
	public String toString() {
		return "Fruita [id=" + id + ", nom=" + nom + ", quantitatQuilos=" + quantitatQuilos + "]";
	}
	
	
	
	

}
