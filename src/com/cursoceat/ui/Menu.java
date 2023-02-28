package com.cursoceat.ui;

import java.util.ArrayList;
import java.util.Scanner;
import com.cursoceat.main.Contactos;

public class Menu extends Contactos {static//para crer objetos de contactos
//llamamos a la otra clase para esta
	
	//metodo
	 ArrayList<Contactos> agenda=new ArrayList<Contactos>();
	 static public void miMenu() {
		int opcion;
		do {
			System.out.println(  "\t\u2735 Agenda Teléfonica \u2735");
			System.out.println("*********************************");
			System.out.println("\t\t1\u227A -1 Alta  ");
			System.out.println("\t\t2\u227A -2 Buscar");
			System.out.println("\t\t3\u227A -3 Mostrar");	
			System.out.println("\n\tSu Opcion es \u27A1");
			opcion=new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1->alta();
			case 2->buscar();
			case 3->mostrar();
			default->System.out.println("ERROR. Tu seleccioón es incorrecta...");
			}	
							
		}while(opcion!=4);
		
	 
	}
	 static public void alta(){	
		String nombre;
		String telefono;
		do {
			System.out.print("\tIndique el nombre del Contacto->");
			nombre=new Scanner(System.in).nextLine();
			
		}while(nombre.isEmpty());
		nombre = pasarMayuscula(nombre);
		do {
			System.out.println("\tIndique el telefono del Contacto->");
			telefono=new Scanner(System.in).nextLine();
		}while(validarTelefono(telefono));
		Contactos unCtto = new Contactos(nombre,telefono);
		agenda.add(unCtto);
	}
	public  static void buscar() {
		String nombre;
		boolean encontrado=false;
		do {
			System.out.println("\tIndique le nombre a buscar");
			nombre=new Scanner(System.in).nextLine();
			
		}while(nombre.isEmpty());
		nombre=pasarMayuscula(nombre);
		for (Contactos c:agenda) {
			String nombreAgenda=c.getNombre();
			if(nombreAgenda.startsWith(nombre)) {
				System.out.println("\t"+ c.getNombre()+"\t("+ c.getTelefono()+")");
				encontrado=true;
			}
	}
		if(!encontrado) {
			System.out.println("\tEl contacto buscado no existe");
		}
		}
	 static void mostrar ()   {
		for(Contactos c:agenda) {
			System.out.println("\t" +c.getNombre()+ "\t(" + c.getTelefono() +")");
			
		}
		
	}
	static String pasarMayuscula(String cadena) {
		  String[]arrayCadenaString=cadena.split(""); 
		  String temp="";
         for (int  i=0;i<arrayCadenaString.length;i++) { 
				  arrayCadenaString[i]=arrayCadenaString[i].substring(0,1).toLowerCase()+
				  arrayCadenaString[i].substring(1).toLowerCase();
				  temp+=arrayCadenaString[i]+" ";
		  }
	  return temp;
	 }
static boolean validarTelefono(String telefono) {
	boolean correcto=false;
	if ((!telefono.startsWith("9")&&!telefono.startsWith("6") && !telefono.startsWith("7"))||telefono.length()!=9) {
		correcto=true;
	}
			return correcto;

	}
}
