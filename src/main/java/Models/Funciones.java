package Models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Funciones {
	public static int imprimirMenu() {
		int opcion;
		Scanner kb = new Scanner(System.in);
		System.out.println("*************** MENU *******************");
		System.out.println("1.- Añadir un Centro");
		System.out.println("2.- Mostrar todos los Centros");
		System.out.println("3.- Añadir un Profesor");
		System.out.println("4.- Mostrar todos los Profesores");
		System.out.println("5.- Añadir una Asignatura");
		System.out.println("6.- Mostrar todas las asignaturas");
		System.out.println("7.- Eliminar un Centro");
		System.out.println("8.- Eliminar un Profesor");
		System.out.println("9.- Eliminar una Asigantura");
		System.out.println("10.- Mostrar Profesores por Centro");
		System.out.println("11.- Mostrar Profesores por Centro con fecha de nacimineto al 1993");
		System.out.println("12.- Mostrar Profesores por Centro que impartan Acceso Datos");
		System.out.println("Salir del programa");
		opcion = kb.nextInt();
		return opcion;

	}
	
	public static Centro datosCentro() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduzca CODIGO DEL CENTRO");
		int cod=kb.nextInt();
		System.out.println("Introduzca NOMBRE DEL CENTRO");
		String nom=kb.next();
		System.out.println("Introduzca DIRECCION DEL CENTRO");
		String direccion = kb.next();
		System.out.println("Introduzca LOCALIDAD DEL CENTRO");
		String localidad = kb.next();
		System.out.println("Introduzca PROVINCIA DEL CENTRO");
		String prov=kb.next();
		return new Centro(cod, nom, direccion, localidad, prov);
	}

	public static Profesor datosProfesor()  {
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduzca CODIGO DEL PROFESOR");
		int cod=kb.nextInt();
		System.out.println("Introduzca NOMBRE DEL PROFESOR");
		String nom=kb.next();
		System.out.println("Introduzca APELLIDOS DEL PROFESOR");
		String ape=kb.next();
		System.out.println("Introduzca FECHA NACIMIENTO DEL PROFESOR (dd/mm/yyyy)");
		String fecha=kb.next();
		Date f=parseFecha(fecha);
		System.out.println("Introduzca SEXO DEL PROFESOR (H/M)");
		String sexo=kb.next();
		char sex=comprobarSexo(sexo);
		System.out.println("Introduzca CODIGO DEL CENTRO DEL PROFESOR");
		int codCentro=kb.nextInt();
		System.out.println("Introduce CODIGO DE LA ASIGNATURA QUE IMPARTIRA");
		int codAsig=kb.nextInt();
		return new Profesor(cod, nom, ape, f, sex, codCentro,codAsig);
	}
	public static Date parseFecha(String fecha)  {
		DateFormat df= new SimpleDateFormat("dd/mm/yyyy");
		Date fechaDate=null;
		try {
			fechaDate = df.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return fechaDate;
    }
	
	public static char comprobarSexo(String sexo) {
		char c=0;
		if(sexo.equals("M")) {
			c=49;
		}
		if(sexo.equals("H")) {
			c=50;
		}
		return c;
	}

	public static Asignatura datosAsignatura() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduce NOMBRE DE LA ASIGNATURA");
		String nom=kb.next();
		System.out.println("Introduce CODIGO DE LA ASIGNATURA");
		int cod=kb.nextInt();
		return new Asignatura(cod, nom);
	}

}
