package it.unimol.ui;

import it.unimol.app.Classroom;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import it.unimol.app.School;

import java.util.Scanner;

public class UI {
    private Scanner scanner;

    public UI() {
        this.scanner = new Scanner(System.in);
    }

    public Student createStudent() {
        System.out.println("Inserisci il nome dello studente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci il cognome dello studente:");
        String surname = scanner.nextLine();
        System.out.println("Inserisci il codice dello studente:");
        int code = scanner.nextInt();
        scanner.nextLine();  // Consuma la linea rimanente
        return new Student(name, code, surname);
    }

    public Teacher createTeacher() {
        System.out.println("Inserisci il nome del docente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci la materia del docente:");
        String subject = scanner.nextLine();
        System.out.println("Inserisci l'ID del docente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consuma la linea rimanente
        return new Teacher(name, id, subject);
    }

    public Classroom createClassroom(Teacher teacher) {
        System.out.println("Inserisci il nome della classe:");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name, teacher);
        System.out.println("Quanti studenti vuoi inserire?");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consuma la linea rimanente

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Inserisci lo studente " + (i + 1) + ":");
            Student student = createStudent();
            classroom.addStudent(student);
        }

        return classroom;
    }

    public School createSchool() {
        System.out.println("\nInserisci il nome della scuola:");
        String name = scanner.nextLine();
        return new School(name);
    }
}
