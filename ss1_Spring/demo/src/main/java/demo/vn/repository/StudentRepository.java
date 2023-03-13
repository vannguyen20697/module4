package demo.vn.repository;

import demo.vn.entity.Student;

import java.util.List;

public interface StudentRepository {
    void create(Student student);
    void delete(Student student);
    void update(Student student);
    Student findById(String id);
    List<Student> findAll();
}
