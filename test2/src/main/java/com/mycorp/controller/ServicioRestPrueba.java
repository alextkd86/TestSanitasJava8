package com.mycorp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycorp.service.ZendeskService;

import util.datos.UsuarioAlta;
@RestController
public class ServicioRestPrueba {
	 /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger( ServicioRestPrueba.class );
	
	@Autowired
	private ZendeskService zendeskService;
	
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public String prueba() {
		LOG.info("Entrando en el rest /prueba");
	    zendeskService.altaTicketZendesk(new UsuarioAlta(), "Prueba");
		return "Nunca devolverá esto, ya que el servicio petará antes";
	}
}
