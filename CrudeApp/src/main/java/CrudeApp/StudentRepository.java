package CrudeApp;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}