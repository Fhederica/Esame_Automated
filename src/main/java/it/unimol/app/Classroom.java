package it.unimol.app;

import java.util.ArrayList;
import java.util.List;

/*
* Gli errori di Spotbugs riguardano principalmente la possibilità che la rappresentazione interna degli oggetti venga esposta
* al di fuori delle classi in cui sono definiti, il che potrebbe portare a modifiche indesiderate da parte di altre
* parti del codice.I metodi getStudents() e getTeacher() dovrebbero restituire copie degli oggetti anziché i riferimenti diretti.
* */

public class Classroom {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Classroom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = new Teacher(teacher.getName(), teacher.getId(), teacher.getSubject());
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(new Student(student.getName(), student.getCode(), student.getSurname()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void setStudents(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public Teacher getTeacher() {
        return new Teacher(teacher.getName(), teacher.getId(), teacher.getSubject());
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = new Teacher(teacher.getName(), teacher.getId(), teacher.getSubject());
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
