/**
 * 
 */
package mic.vn.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mic.vn.microservice.model.Employee;

/**
 * @author truongnh
 * @since 25/04/2022
 */
public interface IEmployeeRepository extends JpaRepository<Employee, String>{

}
