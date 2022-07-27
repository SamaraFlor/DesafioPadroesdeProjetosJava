package com.santanderspringboot;

import org.springframework.stereotype.Component;

@Component
public class Service3 implements Servico {

	@Override
	public String tipo() {
		return "serviço 3 realizado";
	}

	@Override
	public void confirmar() {
		  System.out.println("realizado! 3 ");
		
	}

}
