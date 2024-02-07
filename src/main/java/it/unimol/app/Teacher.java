package it.unimol.app;


import java.util.Objects;

public class Teacher {
    private String name;
    private int id;
    private String subject;

    public Teacher(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }


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


}
