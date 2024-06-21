package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room lectureRoom = new Room("Lecture Hall", RoomType.LECTURE);
        Room computerRoom = new Room("Computer Lab", RoomType.COMPUTER);

        Subject mathematics = new Subject("Mathematics", lectureRoom);
        Subject english = new Subject("English", lectureRoom);
        Subject history = new Subject("History of Japan", lectureRoom);

        Subject poj = new Subject("POJ", computerRoom);
        Subject wia = new Subject("WIA", computerRoom);
        Subject pprg = new Subject("PPRG", computerRoom);

        Group groupA = new Group("Group A");
        Group groupB = new Group("Group B");

        Student student1 = new Student("Adam", "Nowak", "S1");
        Student student2 = new Student("Jan", "Kowalski", "S2");
        Student student3 = new Student("Anna", "Kościuszko", "S3");
        Student student4 = new Student("Joanna", "Przybysz", "S4");
        Student student5 = new Student("Karol", "Bąk", "S5");

        groupA.addStudent(student1);
        groupA.addStudent(student2);
        groupA.addStudent(student5);

        groupB.addStudent(student3);
        groupB.addStudent(student4);
        groupB.addStudent(student5);

        // Adding subjects to groups
        groupA.addSubject(mathematics);
        groupA.addSubject(english);
        groupA.addSubject(history);

        groupB.addSubject(poj);
        groupB.addSubject(wia);
        groupB.addSubject(pprg);

        student1.addGroup(groupA);
        student2.addGroup(groupA);
        student3.addGroup(groupB);
        student4.addGroup(groupB);
        student5.addGroup(groupA);
        student5.addGroup(groupB);

        displayStudentsAndGroups(student1, student2, student3, student4, student5);
    }

    public static void displayStudentsAndGroups(Student... students) {
        for (Student student : students) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            System.out.print("Groups: ");
            for (Group group : student.getGroups()) {
                System.out.print(group.getName() + " ");
            }
            System.out.println("\nSubjects:");
            List<Subject> subjects = student.getSubjects();
            for (Subject subject : subjects) {
                System.out.println("- " + subject.getName() + " (" + subject.getRoom().getName() + ")");
            }
            System.out.println();
        }
    }
}