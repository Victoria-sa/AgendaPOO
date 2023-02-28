package com.cursoceat.main;

public class Contactos {
private String nombre;
private String telefono;
//Metodos constructores
public Contactos(String nombre, String telefono) {
	super();
	this.nombre = nombre;
	this.telefono = telefono;
}
public Contactos(String nombre) {
	super();
	this.nombre = nombre;
}
//metodos setter y getter
public String getNombre() {
	return nombre;
}
//al heredar contactos
public Contactos() {
	super();
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}
	

	


