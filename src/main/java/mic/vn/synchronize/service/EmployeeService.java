/**
 * 
 */
package mic.vn.synchronize.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mic.vn.synchronize.model.Employee;
import mic.vn.synchronize.repository.IEmployeeRepository;

/**
 * @author truongnh
 *
 */
@Service
public class EmployeeService implements IEmployeeService{
	@Autowired 
	private IEmployeeRepository employeeRepository;
	
	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Employee save(Employee t) {
		// TODO Auto-generated method stub
		return employeeRepository.save(t);
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}
	
	
	

}
