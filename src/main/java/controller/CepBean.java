package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import model.Endereco;
import service.ServicoEndereco;

@ManagedBean
@SessionScoped
public class CepBean implements Serializable {

	private static final long serialVersionUID = 1L;


	public Endereco carregarEndereco() {
		
		String cep = null;
		ServicoEndereco servico = new ServicoEndereco();
		Client client = Client.create();
		WebResource wr = client.resource("http://viacep.com.br/ws/" + cep + "/json/");
		System.out.println("CHAMOU O URI....");
		
		Endereco endereco = servico.buscarEnderecoPor(wr.get(String.class));
		String JSON = wr.get(String.class);
		System.out.println(JSON);
		
		return endereco;

	}

}
