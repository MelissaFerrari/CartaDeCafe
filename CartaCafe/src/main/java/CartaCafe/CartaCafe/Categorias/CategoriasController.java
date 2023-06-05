package CartaCafe.CartaCafe.Categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
    @PostMapping("/AddCategoria")
    public ResponseEntity<Categorias> createCategorias(@RequestBody Categorias categorias) {
        Categorias createdCategory = CategoriasService.createCategorias(categorias);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }
    
    @DeleteMapping("/DeleteCategoria/{id}")
    public ResponseEntity<Void> deleteCategorias(@PathVariable("id") Long id) {
        boolean deleted = CategoriasService.deleteCategoria(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
   /* @PutMapping("/UpdateCategorias/{id}")
    public ResponseEntity<Categorias> updateCategorias(@PathVariable(value="id") Long id, @RequestBody Categorias categorias) {
    	 Categorias createdCategory = CategoriasService.updateCategoria(id,categorias);
         return ResponseEntity.status(HttpStatus.OK).body(createdCategory);
      
    	
    }*/

}

