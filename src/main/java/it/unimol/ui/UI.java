package it.unimol.ui;

import it.unimol.app.Classroom;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import it.unimol.app.School;

import java.util.Scanner;

public class UI {

    public UI() {
    }

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in); // Dichiarazione del scanner all'interno del metodo
        System.out.println("Inserisci il nome dello studente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci il cognome dello studente:");
        String surname = scanner.nextLine();
        System.out.println("Inserisci il codice dello studente:");
        int code = scanner.nextInt();
        scanner.nextLine();  // Consuma la linea rimanente
        scanner.close();  // Chiusura dello scanner
        return new Student(name, code, surname);
    }

    public Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in); // Dichiarazione del scanner all'interno del metodo
        System.out.println("Inserisci il nome del docente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci la materia del docente:");
        String subject = scanner.nextLine();
        System.out.println("Inserisci l'ID del docente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consuma la linea rimanente
        scanner.close();  // Chiusura dello scanner
        return new Teacher(name, id, subject);
    }

    public Classroom createClassroom(Teacher teacher) {
        Scanner scanner = new Scanner(System.in); // Dichiarazione del scanner all'interno del metodo
        System.out.println("Inserisci il nome della classe:");
        String name = scanner.nextLine();
        scanner.close();  // Chiusura dello scanner
        return new Classroom(name, teacher);
    }

    public School createSchool() {
        Scanner scanner = new Scanner(System.in); // Dichiarazione del scanner all'interno del metodo
        System.out.println("\nInserisci il nome della scuola:");
        String name = scanner.nextLine();
        scanner.close();  // Chiusura dello scanner
        return new School(name);
    }
}
