package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleados;

public interface IEmpleadoService {

	//Metodos del CRUD
		public List<Empleados> listarEmpleados(); //Listar All 
		
		public Empleados guardarEmpleado(Empleados empleado);	//Guarda un empleado CREATE
		
		public Empleados empleadoXID(String id); //Leer datos de un empleado READ
		
		public Empleados actualizarEmpleado(Empleados empleado); //Actualiza datos del empleado UPDATE
		
		public void eliminarEmpleado(String id);// Elimina el empleado DELETE
}
