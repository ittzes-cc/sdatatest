package com.cc.sdjpa.dto;

import java.util.Set;

public record RoomDTO(String name, Set<StudentDTO> students) {
}
