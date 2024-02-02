package Colegio;

public class Aula {

	private Alumno[] alumnos;

    public Aula(int numeroMaximoAlumnos) {
        this.alumnos = new Alumno[numeroMaximoAlumnos];
    }

    public void agregarAlumno(Alumno alumno, int posicion) {
        if (posicion >= 0 && posicion < alumnos.length) {
            alumnos[posicion] = alumno;
        }
    }

    public void imprimirNotasMediasFinales() {
        System.out.println("Notas medias finales por alumno:");
   
        for (int i = 0; i < alumnos.length; i++) {
          
        	if (alumnos[i] != null) {
                double sumaNotas = 0.0;
                int numAsignaturasConNotas = 0;
                
                for (int j = 0; j < alumnos[i].getAsignaturas().length; j++) {
                    Asignatura asignatura = alumnos[i].getAsignaturas()[j];
               
                    if (asignatura != null) {
                        sumaNotas += asignatura.calcularNotaMedia();
                        numAsignaturasConNotas++;
                    }
                }
                if (numAsignaturasConNotas > 0) {
                    double notaMediaFinal = sumaNotas / numAsignaturasConNotas;
                    System.out.println(alumnos[i].getNombreCompleto() + ": " + notaMediaFinal);
                }
            }
        }
    }
	    }
	

