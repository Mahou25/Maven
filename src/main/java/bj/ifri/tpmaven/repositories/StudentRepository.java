package bj.ifri.tpmaven.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.tpmaven.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByLastname(String lastname);

	public List<Student> findByAge(Integer age);

	public List<Student> findByLastnameContains(String lastname);

	public List<Student> findByLastnameStartsWith(String lastname);

}
