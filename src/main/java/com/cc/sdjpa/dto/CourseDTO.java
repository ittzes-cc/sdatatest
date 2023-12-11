package com.cc.sdjpa.dto;

import java.util.Set;

public record CourseDTO(String name, Set<StudentDTO> students) {
}
