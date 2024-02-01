package it.unimol;
import it.unimol.app.Classroom;
import it.unimol.app.School;
import it.unimol.app.Student;
import it.unimol.app.Teacher;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClasses {
    @Test
    public void testStudent() {
        Student student = new Student("Mario", 1, "Rossi");
        assertEquals("Mario", student.getName());
        assertEquals(1, student.getCode());
        assertEquals("Rossi", student.getSurname());
    }

    @Test
    public void testTeacher() {
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        assertEquals("Prof. Bianchi", teacher.getName());
        assertEquals(1, teacher.getId());
        assertEquals("Scienze", teacher.getSubject());
    }

    @Test
    public void testClass() {
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        Classroom class1 = new Classroom("Classe 1A", teacher);
        assertEquals("Classe 1A", class1.getName());
        assertEquals(teacher, class1.getTeacher());
        assertTrue(class1.getStudents().isEmpty());
    }

    @Test
    public void testSchool() {
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");
        Classroom class1 = new Classroom("Classe 1A", teacher);
        School school = new School("Scuola Superiore");
        school.addClass(class1);
        assertEquals("Scuola Superiore", school.getName());
        assertEquals(1, school.getClasses().size());
    }


}
