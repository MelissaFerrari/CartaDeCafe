package CartaCafe.CartaCafe.Categorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface CategoriasRepository extends JpaRepository<Categorias, Long> {


	Categorias getCategoriaById(long id);
	
		
	}

	
