package Main;

import Main.Classroom;

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
        this.classes.add(aClass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classroom> getClasses() {
        return classes;
    }

    public void setClasses(List<Classroom> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
