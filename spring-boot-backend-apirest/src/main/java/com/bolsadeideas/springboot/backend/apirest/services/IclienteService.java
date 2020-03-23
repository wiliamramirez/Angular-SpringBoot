package com.bolsadeideas.springboot.backend.apirest.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IclienteService {

	public List<Cliente> finAll();

	public Page<Cliente> finAll(Pageable pageable);

	public Cliente FindByID(long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);

}
