package com.practica.genericas;

public class IdentidadPersona {
    private String nombre, apellidos, documento;

    public IdentidadPersona(String nombre, String apellidos, String documento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
