package it.unimol.app;

/**
 * La classe Student rappresenta uno studente con un nome, un codice identificativo e un cognome.
 */
public class Student {
    private String name;
    private int code;
    private String surname;

    /**
     * Costruisce un nuovo studente con il nome, il codice identificativo e il cognome specificati.
     *
     * @param name    Il nome dello studente.
     * @param code    Il codice identificativo dello studente.
     * @param surname Il cognome dello studente.
     */
    public Student(String name, int code, String surname) {
        this.name = name;
        this.code = code;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", surname='" + surname + '\'' +
                '}';
    }

    /**
     * Restituisce il nome dello studente.
     *
     * @return Il nome dello studente.
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome dello studente.
     *
     * @param name Il nuovo nome dello studente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce il codice identificativo dello studente.
     *
     * @return Il codice identificativo dello studente.
     */
    public int getCode() {
        return code;
    }

    /**
     * Imposta il codice identificativo dello studente.
     *
     * @param code Il nuovo codice identificativo dello studente.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Restituisce il cognome dello studente.
     *
     * @return Il cognome dello studente.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Imposta il cognome dello studente.
     *
     * @param surname Il nuovo cognome dello studente.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
