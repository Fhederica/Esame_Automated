package it.unimol.app;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Classroom> classes;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public void addClass(Classroom aClass) {
        this.classes.add(new Classroom(aClass.getName(), aClass.getTeacher()));
        for (Student student : aClass.getStudents()) {
            this.classes.get(this.classes.size() - 1).addStudent(student);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classroom> getClasses() {
        return new ArrayList<>(classes);
    }

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
