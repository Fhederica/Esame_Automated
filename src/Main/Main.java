package Main;

public class Main {
    public static void main(String[] args) {
        // Creazione di studenti
        Student student1 = new Student("Mario", 1, "Rossi");
        Student student2 = new Student("Luigi", 2, "Rossa");

        // Creazione di un docente
        Teacher teacher = new Teacher("Prof. Bianchi", 1, "Scienze");

        // Creazione di una classe e aggiunta degli studenti
        Classroom class1 = new Classroom("Classe 1A", teacher);
        class1.addStudent(student1);
        class1.addStudent(student2);

        // Creazione di una scuola e aggiunta della classe
        School school = new School("Scuola Superiore");
        school.addClass(class1);

        // Stampa delle informazioni sulla scuola
        System.out.println(school.toString());
    }
}
