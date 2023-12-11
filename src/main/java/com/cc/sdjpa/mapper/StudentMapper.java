package com.cc.sdjpa.mapper;

import com.cc.sdjpa.dto.StudentDTO;
import com.cc.sdjpa.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentDTO entityToDto(Student student);
    Student dtoToEntity(StudentDTO studentDTO);
    List<StudentDTO> entityToDto(Iterable<Student> students);
    List<Student> dtoToEntity(Iterable<StudentDTO> studentDTOS);
}
