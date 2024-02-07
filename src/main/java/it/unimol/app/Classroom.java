package it.unimol.app;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Classroom rappresenta una classe di studenti gestita da un insegnante.
 * Gli errori di Spotbugs riguardano principalmente la possibilità che la rappresentazione interna degli oggetti venga esposta
 * al di fuori delle classi in cui sono definiti, il che potrebbe portare a modifiche indesiderate da parte di altre
 * parti del codice. I metodi getStudents() e getTeacher() dovrebbero restituire copie degli oggetti anziché i riferimenti diretti.
 */
public class Classroom {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    /**
     * Costruisce una nuova istanza di Classroom con il nome specificato e l'insegnante fornito.
     *
     * @param name    Il nome della classe.
     * @param teacher L'insegnante della classe.
     */
    public Classroom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = new Teacher(teacher.getName(), teacher.getId(), teacher.getSubject());
        this.students = new ArrayList<>();
    }

    /**
     * Aggiunge uno studente alla classe.
     *
     * @param student Lo studente da aggiungere.
     */
    public void addStudent(Student student) {
        this.students.add(new Student(student.getName(), student.getCode(), student.getSurname()));
    }

    /**
     * Restituisce il nome della classe.
     *
     * @return Il nome della classe.
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome della classe.
     *
     * @param name Il nuovo nome della classe.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce una copia della lista degli studenti della classe.
     *
     * @return Una copia della lista degli studenti della classe.
     */
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    /**
     * Imposta la lista degli studenti della classe.
     *
     * @param students La nuova lista degli studenti della classe.
     */
    public void setStudents(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    /**
     * Restituisce una copia dell'insegnante della classe.
     *
     * @return Una copia dell'insegnante della classe.
     */
    public Teacher getTeacher() {
        return new Teacher(teacher.getName(), teacher.getId(), teacher.getSubject());
    }

    /**
     * Imposta l'insegnante della classe.
     *
     * @param teacher Il nuovo insegnante della classe.
     */
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
