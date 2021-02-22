package Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesor {
	private int codProfesor;
	private String nombre;
	private String apellidos;
	private Date fechaNac;
	private char sexo;
	private int codCentro;
	private int codAsig;
	public Profesor(int codProfesor, String nombre, String apellidos, Date fechaNac, char sexo, int codCentro,int codAsig) {
		super();
		this.codProfesor = codProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.codCentro = codCentro;
		this.codAsig=codAsig;
	}
	public int getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(int codProfesor) {
		this.codProfesor = codProfesor;
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getCodCentro() {
		return codCentro;
	}
	public void setCodCentro(int codCentro) {
		this.codCentro = codCentro;
	}
	
	
	public int getCodAsig() {
		return codAsig;
	}
	public void setCodAsig(int codAsig) {
		this.codAsig = codAsig;
	}
	@Override
	public String toString() {
		return "Codigo de Profesor =" + codProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNac=" + new SimpleDateFormat("yyyy/mm/dd").format(fechaNac) + ", sexo=" + sexo + ", codCentro=" + codCentro+" codAsignatura="+codAsig;
	}
	
	

}
