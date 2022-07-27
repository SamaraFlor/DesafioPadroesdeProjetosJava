package com.santanderspringboot;

import org.springframework.stereotype.Component;

@Component
public class Servico1 implements Servico{

	@Override
	public String tipo() {
		return "serviço 1 realizado";
	}

	@Override
	public void confirmar() {
	  System.out.println("realizado!");
		
	}

}
