package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Fruita {
	@Id
	private String id;
	private String nom;
	private int quantitatQuilos;
	
	
	
	
	
//	public Fruita() {
//	}
//	public Fruita(String id, String nom, int quantitatQuilos) {
//		this.id = id;
//		this.nom = nom;
//		this.quantitatQuilos = quantitatQuilos;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getNom() {
//		return nom;
//	}
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//	public int getQuantitatQuilos() {
//		return quantitatQuilos;
//	}
//	public void setQuantitatQuilos(int quantitatQuilos) {
//		this.quantitatQuilos = quantitatQuilos;
//	}
	
	
	
	
}
