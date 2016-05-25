package br.com.java.restClient;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.google.gson.Gson;

import br.com.java.restClient.entitadeClient.Livro;

public class Main {

	public static void main(String[] args) {
         ResteasyClient client = new ResteasyClientBuilder().build();
         ResteasyWebTarget target = client.target("http://localhost:8080/rest/livros/listar/todos");
         Response response = target.request().get();
         String string = response.readEntity(String.class);
         Gson gson = new Gson();
         
         Livro[] livros = gson.fromJson(string, Livro[].class);
         System.out.println(livros[0].getNome());
	}

}
