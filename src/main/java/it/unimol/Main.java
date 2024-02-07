package it.unimol;

import it.unimol.app.Classroom;
import it.unimol.app.School;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import it.unimol.ui.UI;

/**
 * La classe Main rappresenta il punto di ingresso del programma.
 */
public class Main {

    /**
     * Il metodo main avvia l'esecuzione del programma.
     *
     * @param args Argomenti passati da riga di comando (non utilizzati in questo programma).
     */
    public static void main(String[] args) {
        UI ui = new UI();

        // Crea uno studente
        Student student = ui.createStudent();

        // Crea un docente
        Teacher teacher = ui.createTeacher();

        // Crea una classe con il docente specificato e aggiunge lo studente
        Classroom classroom = ui.createClassroom(teacher);
        classroom.addStudent(student);

        // Crea una scuola e aggiunge la classe
        School school = ui.createSchool();
        school.addClass(classroom);

        // Stampare le informazioni sulla scuola
        System.out.println(school.toString());
    }
}
