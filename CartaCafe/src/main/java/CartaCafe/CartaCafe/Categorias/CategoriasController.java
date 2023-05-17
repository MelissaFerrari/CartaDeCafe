package CartaCafe.CartaCafe.Categorias;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CategoriasController {
	
	@GetMapping("/Test")
	
	public String Test() {
		
		return "Probando";
		
	}

}
