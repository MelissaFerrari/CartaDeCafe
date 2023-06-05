package CartaCafe.CartaCafe.Categorias;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categorias")

@Getter    // getters y setters generados con dependencia lombok
@Setter


public class Categorias {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public Long id;

	    public String nombre;


	
	    
	}

