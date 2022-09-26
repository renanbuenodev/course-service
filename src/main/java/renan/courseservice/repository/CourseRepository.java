package renan.courseservice.repository;

import renan.courseservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>
{
    //findBy+fieldName
}