package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleados;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadosDAO iEmpleadoDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}
	
	@Override
	public Empleados guardarEmpleado(Empleados empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleados empleadoXID(String id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}
}
