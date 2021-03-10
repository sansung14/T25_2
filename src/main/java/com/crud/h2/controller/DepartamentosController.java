package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Departamentos;
import com.crud.h2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentoServideImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos salvarDepartamento(@RequestBody Departamentos departamento) {
		
		return departamentoServideImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamentos departamentoXID(@PathVariable(name="id") Long id) {
		
		Departamentos departamento_xid= new Departamentos();
		
		departamento_xid=departamentoServideImpl.departamentoXID(id);
		
		//System.out.println("Departamento XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_actualizado= new Departamentos();
		
		departamento_seleccionado= departamentoServideImpl.departamentoXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		
		departamento_actualizado = departamentoServideImpl.actualizarDepartamento(departamento_seleccionado);
		
		//System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eleiminarDepartamento(@PathVariable(name="id")Long id) {
		departamentoServideImpl.eliminarDepartamento(id);
	}
	
	
}
