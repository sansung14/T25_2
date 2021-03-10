package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentosDAO;
import com.crud.h2.dto.Departamentos;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IDepartamentoDAO, es como si instaciaramos.
	@Autowired
	IDepartamentosDAO iDepartamentoDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamento(Departamentos departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamentos departamentoXID(Long id) {
		
		return iDepartamentoDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		
		iDepartamentoDAO.deleteById(id);
		
	}

}
