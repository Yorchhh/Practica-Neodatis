package App;


import java.util.Scanner;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import Dao.AsignaturaDao;
import Dao.CentroDao;
import Dao.ProfesorDao;
import Models.Asignatura;
import Models.Centro;
import Models.Funciones;
import Models.Profesor;

public class App {

	public static void main(String[] args)  {
		Scanner kb = new Scanner(System.in);
		ODB odb = ODBFactory.open("neodatis.test");
		CentroDao cDao= new CentroDao(odb);
		ProfesorDao pDao= new ProfesorDao(odb);
		AsignaturaDao aDao= new AsignaturaDao(odb);
		
		int opcion;
		do {
			opcion=Funciones.imprimirMenu();
			switch(opcion) {
			case 1: 
				Centro centro1=Funciones.datosCentro();
				cDao.añadir(centro1);
				odb.commit();
				break;
			case 2: 
				cDao.mostrar();
				break;
			case 3:
				Profesor prof=Funciones.datosProfesor();
				pDao.añadir(prof);
				odb.commit();
				break;
			case 4:
				pDao.mostrar();
				break;
			case 5:
				Asignatura asig=Funciones.datosAsignatura();
				aDao.añadir(asig);
				odb.commit();
				break;
			case 6:
				aDao.mostrar();
				break;
			case 7:
				System.out.println("Introduce el codigo del centro que desea eliminar");
				int codigo=kb.nextInt();
				cDao.eliminarCentro(codigo);
				odb.commit();
				break;
			case 8:
				System.out.println("Introduce el codigo del profesor que desea eliminar");
				int codigo1=kb.nextInt();
				pDao.eliminarProfesor(codigo1);
				odb.commit();
				break;
			case 9:
				System.out.println("Introduce el codigo de la asignatura que desea eliminar");
				int cod=kb.nextInt();
				aDao.eliminarAsignatura(cod);
				odb.commit();
				break;
			case 10:
				System.out.println("Introduce el codigo del centro sobre el que quiere buscar profesores");
				int c=kb.nextInt();
				pDao.mostrarPorCentro(c);
				break;
			case 11:
				System.out.println("Introduce el codigo del centro sobre el que quiere buscar profesores");
				int co=kb.nextInt();
				pDao.mostrarPorEdad(co);
				break;
			case 12:
				System.out.println("Introduce el codigo del centro sobre el que quieres buscar los profesores de Acceso Datos");
				int codi=kb.nextInt();
				pDao.mostrarAD(codi);
				break;
			case 13:
				System.out.println("Introduce el codigo del profesor que quiere comprobar");
				int codigo2=kb.nextInt();
				pDao.comprobarProfesor(codigo2);
				break;
			case 14:
				System.out.println(" HAS SALIDO DEL PROGRAMA ");
				break;
			}
			
		}while(opcion!=14);
		odb.close();
		
	}
	


}
