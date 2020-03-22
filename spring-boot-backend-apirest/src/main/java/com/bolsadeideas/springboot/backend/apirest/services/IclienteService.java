package com.bolsadeideas.springboot.backend.apirest.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

public interface IclienteService {
	
	public List<Cliente> finAll();
	
	public Cliente FindByID(long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
