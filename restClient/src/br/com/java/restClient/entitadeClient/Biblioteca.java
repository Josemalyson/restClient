package br.com.java.restClient.entitadeClient;

import java.util.List;

public class Biblioteca extends EntidadeGenerica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4804213926853238558L;
	private List<Livro> livrosList;

	public Biblioteca() {
		super();
	}

	public Biblioteca(List<Livro> livrosList) {
		this.livrosList = livrosList;
	}

	public List<Livro> getLivrosList() {
		return livrosList;
	}

	public void setLivrosList(List<Livro> livrosList) {
		this.livrosList = livrosList;
	}

}
