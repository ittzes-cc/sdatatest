package com.cc.sdjpa.service;

import com.cc.sdjpa.dto.StudentDTO;
import com.cc.sdjpa.mapper.StudentMapper;
import com.cc.sdjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    private StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public List<StudentDTO> getStudents() {
        return studentMapper.entityToDto(studentRepository.findAll());
    }

    public void saveStudent(StudentDTO studentDTO){
        studentRepository.save(studentMapper.dtoToEntity(studentDTO));
    }
}
