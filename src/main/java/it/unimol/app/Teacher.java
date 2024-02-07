package it.unimol.app;

import java.util.Objects;

/**
 * Classe che rappresenta un insegnante.
 */
public class Teacher {
    private String name;
    private int id;
    private String subject;

    /**
     * Costruttore per la classe Teacher.
     *
     * @param name    Il nome dell'insegnante.
     * @param id      L'ID dell'insegnante.
     * @param subject La materia insegnata dall'insegnante.
     */
    public Teacher(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    /**
     * Restituisce il nome dell'insegnante.
     *
     * @return Il nome dell'insegnante.
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome dell'insegnante.
     *
     * @param name Il nuovo nome dell'insegnante.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce l'ID dell'insegnante.
     *
     * @return L'ID dell'insegnante.
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta l'ID dell'insegnante.
     *
     * @param id Il nuovo ID dell'insegnante.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce la materia insegnata dall'insegnante.
     *
     * @return La materia insegnata dall'insegnante.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta la materia insegnata dall'insegnante.
     *
     * @param subject La nuova materia insegnata dall'insegnante.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Restituisce una rappresentazione testuale dell'insegnante.
     *
     * @return Una stringa che rappresenta l'insegnante.
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }

    /**
     * Verifica se due insegnanti sono uguali.
     *
     * @param obj L'oggetto da confrontare con l'insegnante corrente.
     * @return true se i due insegnanti sono uguali, false altrimenti.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) obj;
        return id == teacher.id &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(subject, teacher.subject);
    }

    /**
     * Restituisce il codice hash dell'insegnante.
     *
     * @return Il codice hash dell'insegnante.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        result = 31 * result + subject.hashCode();
        return result;
    }
}
