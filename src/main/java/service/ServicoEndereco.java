package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Endereco;

public class ServicoEndereco {

	public Endereco buscarEnderecoPor(String urlJson) {
		System.out.println("Chamou o serviço...");
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();
		
		Endereco retorno = gson.fromJson(urlJson, Endereco.class);
		
		return retorno;
	}

}
