package Models;

public class Asignatura {
	private int codAsignatura;
	private String nombre;
	
	public Asignatura(int codAsignatura, String nombre) {
		super();
		this.codAsignatura = codAsignatura;
		this.nombre = nombre;
		
	}
	public int getCodAsignatura() {
		return codAsignatura;
	}
	public void setCodAsignatura(int codAsignatura) {
		this.codAsignatura = codAsignatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Codigo de Asignatura =" + codAsignatura + ", nombre=" + nombre;
	}
	
	
}
