package com.santanderspringboot;

import org.springframework.stereotype.Component;

@Component
public class Service2 implements Servico{

	@Override
	public String tipo() {
		return "serviço 2 realizado";
	}

	@Override
	public void confirmar() {
		  System.out.println("realizado! 2 ");
		
	}

}
