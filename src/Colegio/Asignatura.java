package Colegio;

public class Asignatura {

	
	private String nombre;
    private double nota1;
    private double nota2;
    private double notaFinal;

    public Asignatura(String nombre, double nota1, double nota2, double notaFinal) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaFinal = notaFinal;
    }

    public double calcularNotaMedia() {
        return (nota1 + nota2 + notaFinal) / 3;
    }
	    }
	