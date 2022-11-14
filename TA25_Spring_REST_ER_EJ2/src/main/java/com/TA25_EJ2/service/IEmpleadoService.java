package com.TA25_EJ2.service;

import java.util.List;

import com.TA25_EJ2.dto.Empleado;

public interface IEmpleadoService {

		public List<Empleado> listarEmpleado();
		
		public Empleado guardarEmpleado(Empleado empleado);
		
		public Empleado empleadoXID(Long id);
		
		public Empleado actualizarEmpleado(Empleado empleado); 
		
		public void eliminarEmpleado(Long id);
}
