package Models;

public class Centro {
 
	private int codCentro;
	private String nombreCentro;
	private String direccion;
	private String localidad;
	private String privincia;
	public Centro(int codCentro, String nombreCentro, String direccion, String localidad, String privincia) {
		super();
		this.codCentro = codCentro;
		this.nombreCentro = nombreCentro;
		this.direccion = direccion;
		this.localidad = localidad;
		this.privincia = privincia;
	}
	public int getCodCentro() {
		return codCentro;
	}
	public void setCodCentro(int codCentro) {
		this.codCentro = codCentro;
	}
	public String getNombreCentro() {
		return nombreCentro;
	}
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPrivincia() {
		return privincia;
	}
	public void setPrivincia(String privincia) {
		this.privincia = privincia;
	}
	@Override
	public String toString() {
		return "Codigo de centro= " + codCentro + ", nombreCentro=" + nombreCentro + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", privincia=" + privincia;
	}
	
	
}
