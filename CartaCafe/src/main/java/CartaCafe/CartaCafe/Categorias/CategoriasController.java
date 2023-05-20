package CartaCafe.CartaCafe.Categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CategoriasController {
	
	@Autowired //para llamar de una clase a otra
	CategoriasService CategoriasService;
	
	@GetMapping("/Test")
	
	public String Test() {
		
		return "Probando";
		
	}

	@GetMapping("/GetCategorias")
	
	public List<Categorias>GetCategorias(){
		return CategoriasService.getCategorias();
		
	}
	
}
