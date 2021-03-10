package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Departamentos;

public interface IDepartamentoService {

	//Metodos del CRUD
	public List<Departamentos> listarDepartamentos(); //Listar All 
	
	public Departamentos guardarDepartamento(Departamentos departamento);	//Guarda un departamento CREATE
	
	public Departamentos departamentoXID(Long id); //Leer datos de un departamento READ
	
	public Departamentos actualizarDepartamento(Departamentos departamento); //Actualiza datos del departamento UPDATE
	
	public void eliminarDepartamento(Long id);// Elimina el departamento DELETE
	
	
}
