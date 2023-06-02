/**
 * 
 */
package bj.ifri.tpmaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.tpmaven.entities.University;

/**
 * @author koukpaki
 *
 */
public interface UniversityRepository extends JpaRepository<University, Long> {

}
