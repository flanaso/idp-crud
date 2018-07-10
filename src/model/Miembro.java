package model;

public class Miembro {
	private int no;
	private String nombre;
	private String direccion;
	private String fechaNacimiento;
	private String fechaConversion;
	private String fechaBautizo;
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaConversion() {
		return fechaConversion;
	}

	public void setFechaConversion(String fechaConversion) {
		this.fechaConversion = fechaConversion;
	}

	public String getFechaBautizo() {
		return fechaBautizo;
	}

	public void setFechaBautizo(String fechaBautizo) {
		this.fechaBautizo = fechaBautizo;
	}

	public String getFechaPacto() {
		return fechaPacto;
	}

	public void setFechaPacto(String fechaPacto) {
		this.fechaPacto = fechaPacto;
	}

	public String getAreaServicio() {
		return areaServicio;
	}

	public void setAreaServicio(String areaServicio) {
		this.areaServicio = areaServicio;
	}

	private String fechaPacto;
	private String areaServicio;
	
	public Miembro(String nombre, String direccion, String fechaNacimiento, String fechaConversion, String fechaBautizo, String fechaPacto, String areaServicio) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaConversion = fechaConversion;
		this.fechaBautizo = fechaBautizo;
		this.fechaPacto = fechaPacto;
		this.areaServicio = areaServicio;
	}
	
	
}
