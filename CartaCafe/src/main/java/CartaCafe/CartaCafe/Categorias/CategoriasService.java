package CartaCafe.CartaCafe.Categorias;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasService {

 @Autowired 
 
 CategoriasRepository categoriasRepository;

 
 	public List<Categorias> getCategorias() {
	        return categoriasRepository.findAll();
	}
 	
  
 	public Categorias getCategoriasByid(Long id) {
        return this.categoriasRepository.getCategoriaById(id);
}

 	public Categorias createCategorias(Categorias categorias) {
         return categoriasRepository.save(categorias);
    }
/*

		 public Categorias updateCategoria(Long id, Categorias categoria) {
		       Optional<Categorias> optionalCategoria = categoriasRepository.findById(id);
		        if (optionalCategoria.isPresent()) {
		            Categorias existingCategoria = new Categorias();
		            existingCategoria.setNombre(categoria.getNombre());
		            // Actualizar los demás campos según sea necesario

		            return categoriasRepository.save(existingCategoria);
		        } else {
		            return null;
		        }
	}*/


	public boolean deleteCategoria(Long id){
		Optional<Categorias> optionalCategoria = categoriasRepository.findById(id);
	    if (optionalCategoria.isPresent()) {
	    	categoriasRepository.deleteById(id);
	        return true;
	    } else {
	        return false;
	        }
	    }

}	
 	


