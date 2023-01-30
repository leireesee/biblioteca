package clases;

import java.sql.Date;

public class Prestamo {
	
	private int idLibro;
	private int idSocio;
	private Date fecha;
	private boolean devuelto;
	
		
	@Override
	public String toString() {
		return "idLibro;" + idLibro + ", idSocio;" + idSocio + ", fecha;" + fecha + ", devuelto;" + devuelto;
	}
	
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
	
}
