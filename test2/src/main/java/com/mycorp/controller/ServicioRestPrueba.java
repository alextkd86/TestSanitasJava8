package com.mycorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycorp.service.ZendeskService;

import util.datos.UsuarioAlta;
@RestController
public class ServicioRestPrueba {
	
	@Autowired
	private ZendeskService zendeskService;
	
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public String prueba() {
//    	zendeskService.altaTicketZendesk(new UsuarioAlta(), "Prueba");
		return "Welcome to RestTemplate Example.";
	}
}
