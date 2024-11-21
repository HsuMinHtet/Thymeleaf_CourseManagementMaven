package org.example.coursemanagementdemo.repository;

import org.example.coursemanagementdemo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
