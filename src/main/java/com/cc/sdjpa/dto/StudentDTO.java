package com.cc.sdjpa.dto;

import java.util.Set;

public record StudentDTO(String firstName,
                         String lastName,
                         RoomDTO room,
                         Set<CourseDTO> courses) {
}
