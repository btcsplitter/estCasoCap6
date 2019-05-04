package com.eduardopenshorn.estudoDeCasoCapSeis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardopenshorn.estudoDeCasoCapSeis.domain.Categoria;
import com.eduardopenshorn.estudoDeCasoCapSeis.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
		
	}
	
	
}
