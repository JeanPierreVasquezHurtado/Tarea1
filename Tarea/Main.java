package Tarea;

public class Main {
    public static void main(String[] args) {


        Semestre semestre = new Semestre("2022-I");

        Docentes docentes = new Docentes("Freedy");
        Docentes docentes1 = new Docentes("Alvaro");

        Docentes docentes2 = new Docentes("Mateo");
        Docentes docentes3 = new Docentes("Manuel");

        Docentes docentes4 = new Docentes("Hernan");
        Docentes docentes5 = new Docentes("Juan");


        Cursos cursos = new Cursos("Algebra");
        Cursos cursos1 = new Cursos("Programacion Orientada a Objetos");
        Cursos cursos2 = new Cursos("Base de Datos");



        Matricula matricula = new Matricula(2019110489);

        matricula.setSemestre(semestre);
        matricula.setCursos(cursos);
        matricula.setCursos(cursos1);
        matricula.setCursos(cursos2);


        cursos.setDocentes(docentes);
        cursos.setDocentes(docentes1);

        cursos1.setDocentes(docentes2);
        cursos1.setDocentes(docentes3);

        cursos2.setDocentes(docentes4);
        cursos2.setDocentes(docentes5);



        Estudiante estudiante = new Estudiante("Jean Pierre Vasquez Hurtado");
        System.out.println("Estudiante: "+estudiante.getNombre());

        estudiante.setMatricula(matricula);

        for (Matricula m: estudiante.getMatricula())
        {
            System.out.println("Codigo del estudiante: "+m.getCodMatri());

            for (Semestre s: m.getSemestre())
            {
                System.out.println("Semestre: "+s.getNombre());
            }
            for (Cursos c: m.getCursos())
            {
                System.out.println("Cursos: "+c.getNombre());

                for (Docentes d: c.getDocentes())
                {
                    System.out.println("Docentes: "+d.getNombre());
                }
            }
        }



    }
}
