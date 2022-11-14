package com.TA25_EJ2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="departamento")
public class Departamento {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long codigo;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "presupuesto")
		private int presupuesto;
		
	    @OneToMany
		@JoinColumn(name="dni")
	    private List<Empleado> empleado;
	
		public Departamento() {
		}

		/**
		 * @param codigo
		 * @param nombre
		 * @param presupuesto
		 */
		public Departamento(Long codigo, String nombre, int presupuesto) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.presupuesto = presupuesto;
		}

		/**
		 * @return the codigo
		 */
		public Long getCodigo() {
			return codigo;
		}

		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the presupuesto
		 */
		public int getPresupuesto() {
			return presupuesto;
		}

		/**
		 * @param presupuesto the presupuesto to set
		 */
		public void setPresupuesto(int presupuesto) {
			this.presupuesto = presupuesto;
		}

		/**
		 * @return the empleado
		 */
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
		public List<Empleado> getEmpleado() {
			return empleado;
		}

		/**
		 * @param empleado the empleado to set
		 */
		public void setEmpleado(List<Empleado> empleado) {
			this.empleado = empleado;
		}

		@Override
		public String toString() {
			return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto
					+ ", empleado=" + empleado + "]";
		}

		
		

		
		
		
	

}
