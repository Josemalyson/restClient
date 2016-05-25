package br.com.java.restClient;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class Main {

	public static void main(String[] args) {
         ResteasyClient client = new ResteasyClientBuilder().build();
         ResteasyWebTarget target = client.target("http://localhost:8080/rest/livros/listar/todos");
         Response response = target.request().get();
         String string = response.readEntity(String.class);
         System.out.println(string);
	}

}
