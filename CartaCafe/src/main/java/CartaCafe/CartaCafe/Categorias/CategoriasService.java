package CartaCafe.CartaCafe.Categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasService {

 @Autowired 
 
 CategoriasRepository categoriasRepository;

 
 	public List<Categorias> getCategorias() {
	        return categoriasRepository.findAll();
	}
 	
}

	
