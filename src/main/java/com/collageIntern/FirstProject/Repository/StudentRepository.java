package com.collageIntern.FirstProject.Repository;

import com.collageIntern.FirstProject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
}
