package com.santanderspringboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesteFactoryMethod {

	@Autowired
	private List<Servico> servicos;
	
	 private static final Map<String, Servico> meusServicos = new HashMap<>();
	

	 @PostConstruct
	    public void iniciandoMeusServicos() {
	        for(Servico servico : servicos) {
	        	meusServicos.put(servico.tipo(), servico);
	        }
	    
	   }

	 public static Servico getServicoe(String tipo) {
	        Servico servico = meusServicos.get(tipo);
	        if(servico == null) throw new RuntimeException("Serviço realizado foi: " + tipo);
	        return servico;
	    }

}
