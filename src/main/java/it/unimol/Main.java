package it.unimol;

import it.unimol.app.Classroom;
import it.unimol.app.School;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import it.unimol.ui.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Student stuedent = ui.createStudent();
        Teacher teacher = ui.createTeacher();
        Classroom classroom = ui.createClassroom(teacher);
        classroom.addStudent(stuedent);
        School school = ui.createSchool();
        school.addClass(classroom);
        System.out.println(school.toString());
    }
}
