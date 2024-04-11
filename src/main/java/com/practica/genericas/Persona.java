package com.practica.genericas;

public class Persona {
	private String email, direccion, cp;
	FechaHora fechaNacimiento;
	private IdentidadPersona identidadPersona;

	public Persona() {

	}

	public Persona(IdentidadPersona identidadPersona, String email, String direccion,
			FechaHora fechaNacimiento) {
		super();
		this.identidadPersona = identidadPersona;
		this.email = email;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public IdentidadPersona getIdentidadPersona() {
		return identidadPersona;
	}

	public void setIdentidadPersona(IdentidadPersona identidadPersona) {
		this.identidadPersona = identidadPersona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public FechaHora getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(FechaHora fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		FechaHora fecha = getFechaNacimiento();
		String cadena = "";
		// Documento
		cadena += String.format("%s;", identidadPersona.getDocumento());
		// Nombre y apellidos
		cadena += String.format("%s,%s;", identidadPersona.getApellidos(), identidadPersona.getNombre());
		// correo electrónico
		cadena += String.format("%s;", getEmail());
		// Direccion y código postal
		cadena += String.format("%s,%s;", getDireccion(), getCp());
		// Fecha de nacimiento
		cadena += String.format("%02d/%02d/%04d\n", fecha.getFecha().getDia(),
				fecha.getFecha().getMes(),
				fecha.getFecha().getAnio());

		return cadena;
	}
}
