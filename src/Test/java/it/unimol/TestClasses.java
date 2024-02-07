package it.unimol;

import it.unimol.app.Classroom;
import it.unimol.app.School;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * La classe TestClasses contiene una serie di test JUnit per le classi Student, Teacher e Classroom.
 */
public class TestClasses {

    /**
     * Test per la classe Student.
     */
    @Test
    public void testStudent() {
        // Creazione di uno studente e verifica dei suoi attributi
        Student student = new Student("Mario", 1, "Rossi");
        assertEquals("Mario", student.getName());
        assertEquals(1, student.getCode());
        assertEquals("Rossi", student.getSurname());
    }

    /**
     * Test per la classe Teacher.
     */
    @Test
    public void testTeacher() {
        // Creazione di un insegnante e verifica dei suoi attributi
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        assertEquals("Prof. Bianchi", teacher.getName());
        assertEquals(1, teacher.getId());
        assertEquals("Scienze", teacher.getSubject());
    }

    /**
     * Test per la classe Classroom.
     */
    @Test
    public void testClass() {
        // Creazione di un insegnante
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        // Creazione di una classe e verifica dei suoi attributi
        Classroom class1 = new Classroom("Classe 1A", teacher);
        assertEquals("Classe 1A", class1.getName());
        assertEquals(teacher, class1.getTeacher());
        assertTrue(class1.getStudents().isEmpty()); // Verifica che non ci siano studenti
    }

    //37% coverage con testSchool, 28% senza

    @Test
    public void testSchool() {
        // Creazione di un insegnante e di una classe
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        Classroom class1 = new Classroom("Classe 1A", teacher);
        // Creazione di una scuola, aggiunta della classe e verifica dei suoi attributi
        School school = new School("Scuola Superiore");
        school.addClass(class1);
        assertEquals("Scuola Superiore", school.getName());
        assertEquals(1, school.getClasses().size()); // Verifica che ci sia una sola classe nella scuola
    }


}
