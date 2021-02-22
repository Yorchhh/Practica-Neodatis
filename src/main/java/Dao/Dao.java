package Dao;

import java.util.List;

import org.neodatis.odb.Objects;

public interface Dao<T> {
	
	Objects<T> mostrar();

	void añadir(T t);

	void actualizar(int id, T t);

	void eliminar(T t);
	
	public T mostrarporId(int id);
	
	
	
}
