package Dao;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import Models.Centro;

public class CentroDao implements Dao<Centro> {
	private ODB odb;

	public CentroDao(ODB odb) {
		super();
		this.odb = odb;
	}

	public Objects<Centro> mostrar() {
		Objects<Centro> iterador = odb.getObjects(Centro.class);
		System.out.println("Numero de Centros: " + iterador.size());
		while (iterador.hasNext()) {
			Centro c = iterador.next();
			System.out.println(c);
		}
		return null;
	}

	public void añadir(Centro t) {
		odb.store(t);
		System.out.println("Centro " + t.getNombreCentro() + " ha sido introducido en la Base de Datos");

	}

	public void actualizar(int id, Centro t) {
		// TODO Auto-generated method stub

	}

	

	public Centro mostrarporId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminar(Centro t) {
		

	}

	public void eliminarCentro(int codigo) {
		IQuery query = new CriteriaQuery(Centro.class,Where.equal("codCentro", codigo));
		Objects<Centro> it= odb.getObjects(query);
		Centro c= (Centro) odb.getObjects(query).getFirst();
		odb.delete(c);
	}

}
