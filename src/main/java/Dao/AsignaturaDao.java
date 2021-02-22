package Dao;

import java.util.List;

import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import Models.Asignatura;
import Models.Centro;
import Models.Profesor;

public class AsignaturaDao implements Dao<Asignatura> {
	private ODB odb;

	public AsignaturaDao(ODB odb) {
		super();
		this.odb = odb;
	}

	public Objects<Asignatura> mostrar() {
		Objects<Asignatura> iterador = odb.getObjects(Asignatura.class);
		System.out.println("Numero de Asignaturas: " + iterador.size());
		while (iterador.hasNext()) {
			Asignatura a = iterador.next();
			System.out.println(a);
		}
		return null;
	}

	public void añadir(Asignatura t) {
		odb.store(t);
		System.out.println(t.getNombre() + " ha sigo introducida en la base de datos");

	}

	public void actualizar(int id, Asignatura t) {
		// TODO Auto-generated method stub

	}

	public void eliminar(Asignatura t) {
		odb.delete(t);
		System.out.println("Asigantura " + t.getNombre() + " ha sido eliminada de la Base de Datos");
	}

	public Asignatura mostrarporId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarAsignatura(int cod) {

		IQuery query = new CriteriaQuery(Asignatura.class,Where.equal("codAsignatura", cod));
		Objects<Asignatura> it= odb.getObjects(query);
		Asignatura a= (Asignatura) odb.getObjects(query).getFirst();
		odb.delete(a);
	}

}
