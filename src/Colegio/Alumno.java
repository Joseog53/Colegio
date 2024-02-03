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

	public void asignarAsignatura(String nombreAsignatura, double nota1, double nota2, double notaFinal) {

		for (int i = 0; i < asignaturas.length; i++) {

			if (asignaturas[i] == null) {

				asignaturas[i] = new Asignatura(nombreAsignatura, nota1, nota2, notaFinal);

				break;
			}
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