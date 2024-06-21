package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private List<Subject> subjects;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
