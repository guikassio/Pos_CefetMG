package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Postage {
	
	private String nome;
	private String msg;
	
	List<PostageAtributo> atributos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<PostageAtributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<PostageAtributo> atributos) {
		this.atributos = atributos;
	}
	
	

}


@Document
class PostageAtributo{
	
	private String atributo, valorAtributo;

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getValorAtributo() {
		return valorAtributo;
	}

	public void setValorAtributo(String valorAtributo) {
		this.valorAtributo = valorAtributo;
	}
	
	
	
}
