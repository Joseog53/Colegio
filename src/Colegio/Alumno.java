package Colegio;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura[] asignaturas;

	public Alumno(String nombre, String apellidos, String telefono, int numAsignaturas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.asignaturas = new Asignatura[numAsignaturas];
	}

	public void asignarAsignatura(Asignatura asignatura, int posicion) {
		if (posicion >= 0 && posicion < asignaturas.length) {
			asignaturas[posicion] = asignatura;
		}
	}

	public String getNombreCompleto() {
		return nombre + " " + apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}
}