package br.com.java.restClient.entitadeClient;

import java.io.Serializable;

public class EntidadeGenerica implements Serializable {

	private static final long serialVersionUID = 8139418347070247235L;
	
	private Long id;
	private String nome;

	public EntidadeGenerica() {
		super();
	}

	public EntidadeGenerica(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadeGenerica other = (EntidadeGenerica) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
