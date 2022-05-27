package Tarea;

public class Matricula {


    private int codMatri;
    private Semestre[] semestre;
    private int contador;
    private Cursos[] cursos;
    private int contadorr;


    public Matricula(int codMatri) {
        this.codMatri = codMatri;
        this.contador = 0;
        this.semestre = new Semestre[1];
        this.contadorr = 0;
        this.cursos = new Cursos[3];
    }


    public int getCodMatri() {
        return codMatri;
    }


    public void setSemestre(Semestre semestre) {
        this.semestre[this.contador++] = semestre;
    }

    public Semestre[] getSemestre() {
        return semestre;
    }

    public void setCursos(Cursos cursos) {
        this.cursos[this.contadorr++]= cursos;
    }

    public Cursos[] getCursos() {
        return cursos;
    }
}
