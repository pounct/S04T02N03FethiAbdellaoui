package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.entities;

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
	
}
