package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImp implements StudentRepository {
    private Map<Long, Student> studentMap;

    public StudentRepositoryImp() {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 12));
        studentMap.put(2L, new Student(1L, "李四", 20));
        studentMap.put(3L, new Student(1L, "王五", 25));

    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {

        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
