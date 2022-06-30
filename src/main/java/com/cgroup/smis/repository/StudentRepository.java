package com.cgroup.smis.repository;

import com.cgroup.smis.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
