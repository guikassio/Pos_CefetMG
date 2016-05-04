package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostageRepository  extends MongoRepository<Postage, String> {
	
	List<Postage> findByAtributosAtributo(String nomeAtributo);

	
	void deleteByAtributosAtributo(String nomeAtributo);



}
