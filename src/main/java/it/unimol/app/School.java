package it.unimol.app;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe School rappresenta una scuola con una lista di classi.
 */
public class School {
    private String name;
    private List<Classroom> classes;

    /**
     * Costruisce una nuova istanza di School con il nome specificato.
     *
     * @param name Il nome della scuola.
     */
    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }

    /**
     * Aggiunge una classe alla scuola.
     *
     * @param aClass La classe da aggiungere.
     */
    public void addClass(Classroom aClass) {
        this.classes.add(new Classroom(aClass.getName(), aClass.getTeacher()));
        for (Student student : aClass.getStudents()) {
            this.classes.get(this.classes.size() - 1).addStudent(student);
        }
    }

    /**
     * Restituisce il nome della scuola.
     *
     * @return Il nome della scuola.
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome della scuola.
     *
     * @param name Il nuovo nome della scuola.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce una copia della lista delle classi della scuola.
     *
     * @return Una copia della lista delle classi della scuola.
     */
    public List<Classroom> getClasses() {
        return new ArrayList<>(classes);
    }

    /**
     * Imposta la lista delle classi della scuola.
     *
     * @param classes La nuova lista delle classi della scuola.
     */
    public void setClasses(List<Classroom> classes) {
        this.classes = new ArrayList<>(classes);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
