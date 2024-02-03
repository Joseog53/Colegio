package Colegio;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Aula aula = new Aula(5);
     
		  aula.agregarAlumno("Juan", "Perez", "123456789", 2);
	       aula.agregarAlumno("Maria", "Gomez", "987654321", 2);
	        
	        aula.alumnos[0].asignarAsignatura("Matematicas", 8.5, 9.0, 8.8);
	        aula.alumnos[0].asignarAsignatura("Ciencias", 7.0, 8.0, 7.5);

	        aula.alumnos[1].asignarAsignatura("Matematicas", 9.0, 8.5, 8.8);
	        aula.alumnos[1].asignarAsignatura("Ciencias", 8.0, 7.5, 8.0);
	}

}
