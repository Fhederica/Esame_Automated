package it.unimol.ui;

import it.unimol.app.Classroom;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import it.unimol.app.School;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * La classe UI fornisce metodi per interagire con l'utente e creare istanze di studenti, docenti, classi e scuole.
 */
public class UI {

    /**
     * Crea un nuovo oggetto UI.
     */
    public UI() {
    }

    /**
     * Crea un nuovo studente chiedendo all'utente di inserire il nome, il cognome e il codice dello studente.
     *
     * @return Lo studente creato.
     */
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Inserisci il nome dello studente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci il cognome dello studente:");
        String surname = scanner.nextLine();
        System.out.println("Inserisci il codice dello studente:");
        int code = scanner.nextInt();
        scanner.nextLine();
        return new Student(name, code, surname);
    }

    /**
     * Crea un nuovo docente chiedendo all'utente di inserire il nome, la materia e l'ID del docente.
     *
     * @return Il docente creato.
     */
    public Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Inserisci il nome del docente:");
        String name = scanner.nextLine();
        System.out.println("Inserisci la materia del docente:");
        String subject = scanner.nextLine();
        System.out.println("Inserisci l'ID del docente:");
        int id = scanner.nextInt();
        scanner.nextLine();
        return new Teacher(name, id, subject);
    }

    /**
     * Crea una nuova classe chiedendo all'utente di inserire il nome e utilizzando il docente specificato.
     *
     * @param teacher Il docente della classe.
     * @return La classe creata.
     */
    public Classroom createClassroom(Teacher teacher) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Inserisci il nome della classe:");
        String name = scanner.nextLine();
        return new Classroom(name, teacher);
    }

    /**
     * Crea una nuova scuola chiedendo all'utente di inserire il nome.
     *
     * @return La scuola creata.
     */
    public School createSchool() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("\nInserisci il nome della scuola:");
        String name = scanner.nextLine();
        return new School(name);
    }
}
