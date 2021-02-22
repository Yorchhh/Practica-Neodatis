package Dao;

import java.sql.Date;
import java.util.List;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import Models.Centro;
import Models.Profesor;

public class ProfesorDao implements Dao<Profesor> {

	private ODB odb;

	public ProfesorDao(ODB odb) {
		super();
		this.odb = odb;
	}

	public Objects<Profesor> mostrar() {
		Objects<Profesor> iterador = odb.getObjects(Profesor.class);
		System.out.println("Numero de Profesores: " + iterador.size());
		while (iterador.hasNext()) {
			Profesor p = iterador.next();
			System.out.println(p);
		}
		return null;
	}

	public void añadir(Profesor t) {
		odb.store(t);
		System.out.println("Profesor " + t.getNombre() + " ha sido añadido a la Base de Datos");

	}

	public void actualizar(int id, Profesor t) {
		// TODO Auto-generated method stub

	}

	public void eliminar(Profesor t) {
		odb.delete(t);
		System.out.println("Profesor " + t.getNombre() + " ha sido eliminado de la Base de Datos");
	}

	public Profesor mostrarporId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarProfesor(int codigo) {

		IQuery query = new CriteriaQuery(Profesor.class, Where.equal("codProfesor", codigo));
		Objects<Profesor> it = odb.getObjects(query);
		Profesor p = (Profesor) odb.getObjects(query).getFirst();
		odb.delete(p);
	}

	public void mostrarPorCentro(int codigo) {
		IQuery query = new CriteriaQuery(Profesor.class, Where.equal("codCentro", codigo));
		Objects<Profesor> ite = odb.getObjects(query);
		while (ite.hasNext()) {
			Profesor p = ite.next();
			System.out.println(p);
		}
	}

	public void mostrarPorEdad(int co) {
		Date d = new Date(93, 1, 1);
		ICriterion criterio = new And().add(Where.equal("codCentro", co)).add(Where.lt("fechaNac", d));
		IQuery query = new CriteriaQuery(Profesor.class, criterio);
		Objects<Profesor> iterador = odb.getObjects(query);
		while (iterador.hasNext()) {
			Profesor p = iterador.next();
			System.out.println(p);
		}
	}

	public void mostrarAD(int codi) {

		ICriterion criterio = new And().add(Where.equal("codCentro", codi)).add(Where.equal("codAsig", 1));
		IQuery query = new CriteriaQuery(Profesor.class, criterio);
		Objects<Profesor> ite = odb.getObjects(query);
		while (ite.hasNext()) {
			Profesor p = ite.next();
			System.out.println(p);
		}
	}

	public void comprobarProfesor(int codigo2) {
		IQuery query = new CriteriaQuery(Profesor.class, Where.equal("codProfesor", codigo2));
		Objects<Profesor> iterador = odb.getObjects(query);
		

	}

}
