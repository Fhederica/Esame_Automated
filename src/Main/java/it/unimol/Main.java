package it.unimol;

import it.unimol.app.Classroom;
import it.unimol.app.School;
import it.unimol.app.Teacher;
import it.unimol.ui.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();

        // Creazione di un docente
        Teacher teacher = ui.createTeacher();

        // Creazione di una classe e aggiunta degli studenti
        Classroom classroom = ui.createClassroom(teacher);

        // Creazione di una scuola e aggiunta della classe
        School school = ui.createSchool();
        school.addClass(classroom);

        // Stampa delle informazioni sulla scuola
        System.out.println(school.toString());
    }
}
