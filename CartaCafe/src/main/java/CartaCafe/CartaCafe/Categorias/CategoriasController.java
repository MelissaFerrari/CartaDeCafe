package CartaCafe.CartaCafe.Categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CategoriasController {
	
	@Autowired //para llamar de una clase a otra
	CategoriasService CategoriasService;
	
	
	@Autowired 
	 CategoriasRepository categoriasRepository; 
	
	@GetMapping("/Test")
	
	public String Test() {
		
		return "Probando";
		
	}

	@GetMapping("/GetCategorias")
	
	public List<Categorias>GetCategorias(){
		return CategoriasService.getCategorias();
		
	}
	
	
    @GetMapping("/GetCategorias/{id}")
    public Categorias getCategoriasById(@PathVariable(value = "id") long id) {
        return CategoriasService.getCategoriasByid(id);
    }
	

}
