package org.example.coursemanagementdemo.service;

import org.example.coursemanagementdemo.dto.request.CourseRequestDTO;
import org.example.coursemanagementdemo.dto.response.CourseResponseDTO;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Optional<CourseResponseDTO> createCourse(CourseRequestDTO courseRequestDTO);
    List<CourseResponseDTO> getAllCourse();

}
