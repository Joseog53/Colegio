package Colegio;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Asignatura matematicas = new Asignatura("Matematicas", 8.5, 9.0, 8.8);
        Asignatura ciencias = new Asignatura("Ciencias", 7.0, 8.0, 7.5);
     
        Alumno alumno1 = new Alumno("Juan", "Perez", "123456789", 2);
        Alumno alumno2 = new Alumno("Maria", "Gomez", "987654321", 2);
      
        alumno1.asignarAsignatura(matematicas, 0);
        alumno1.asignarAsignatura(ciencias, 1);
        alumno2.asignarAsignatura(matematicas, 0);
        alumno2.asignarAsignatura(ciencias, 1);
      
        
        Aula aula = new Aula(5);
        aula.agregarAlumno(alumno1, 0);
        aula.agregarAlumno(alumno2, 1);

        aula.imprimirNotasMediasFinales();
	}

}
