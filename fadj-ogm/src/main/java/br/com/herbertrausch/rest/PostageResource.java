package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Endereco;
import br.com.herbertrausch.spring.mongo.Postage;
import br.com.herbertrausch.spring.mongo.PostageService;
import br.com.herbertrausch.spring.mongo.Produto;
import br.com.herbertrausch.spring.mongo.ProdutoService;

@Path("/postage")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PostageResource {

	PostageService service = new PostageService();
	
	@GET
	public List<Postage> get() {
		
		return service.getAll();
		
	}
	
	@GET
	@Path("/atributo/{texto}")
	public List<Postage> getByMensagem(@PathParam("texto") String texto) {
		return service.getByAtributo(texto);
	}

	
	/*@GET
	@Path("/{valorFrom}/{valorTo}")
	/*public List<Produto> getByValor(@PathParam("valorFrom") int valorFrom, @PathParam("valorTo") int valorTo) {
		return service.getAll(valorFrom, valorTo);
	}*/
	
	
	@DELETE
	@Path("/{atributo}")
	public void save(@PathParam("atributo") String atributo){
		
		service.deleteByAtributo(atributo);
		
	}
	
	@POST
	public void save(Postage e){
		
		service.insert(e);
		
	}

}
