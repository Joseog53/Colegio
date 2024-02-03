package Colegio;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula aula = new Aula(5);

		aula.agregarAlumno("Juan", "Perez", "123456789", 2);
		aula.agregarAlumno("Maria", "Gomez", "987654321", 2);

		aula.alumnos[0].asignarAsignatura("Matematicas", 6.5, 3.4, 4.8);
		aula.alumnos[0].asignarAsignatura("Ciencias", 4.5, 8.2, 6.3);

		aula.alumnos[1].asignarAsignatura("Matematicas", 9.0, 9.2, 8.8);
		aula.alumnos[1].asignarAsignatura("Ciencias", 4.0, 3.5, 4.6);

		System.out.println("Notas medias finales por alumno:");
		aula.imprimirNotasMediasFinales();
	}

}
