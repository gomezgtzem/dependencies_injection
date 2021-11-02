package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final List<Student> studentList = new ArrayList<>();

    public StudentServiceImpl(){
        addStudents();
    }

    private void addStudents() {
        studentList.add(new Student("1",1,"Emmanuel", "Gomez", 1));
        studentList.add(new Student("2",2,"Eduardo", "Juseppe", 2));
        studentList.add(new Student("3",3,"Jesus", "Serrano", 3));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {
        return studentList.get(Integer.parseInt((id)));
    }

}
