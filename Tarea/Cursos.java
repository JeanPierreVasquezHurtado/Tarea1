package Tarea;

public class Cursos {

    private String nombre;
    private Docentes[] docentes;
    private int contador;

    public Cursos(String nombre) {
        this.nombre = nombre;
        this.contador = 0;
        this.docentes = new Docentes[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes[this.contador++] = docentes;
    }

    public Docentes[] getDocentes() {
        return docentes;
    }
}
