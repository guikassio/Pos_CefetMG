package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PostageService {

	private PostageRepository db;
	
	public PostageService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(PostageRepository.class);
	}
	
	public void insert(Postage e){
		db.save(e);
	}
	
	
	

	
	public void deleteByAtributo(String nomeAtributo){
		db.deleteByAtributosAtributo(nomeAtributo);
	}
	
	public List<Postage> getAll(){
		
		return db.findAll();
	}
	
	public List<Postage> getByAtributo(String atributo){
		
		return db.findByAtributosAtributo(atributo);
	}

}

