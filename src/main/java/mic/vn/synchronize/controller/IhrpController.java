/**
 * 
 */
package mic.vn.synchronize.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mic.vn.synchronize.model.Employee;
import mic.vn.synchronize.service.IEmployeeService;

/**
 * @author truongnh
 *@since 25/04/2022
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/ihrp")
public class IhrpController {
	//logger
	public static Logger logger = LoggerFactory.getLogger(IhrpController.class);
	
	@Autowired
	IEmployeeService employeeService;
	// lấy tất cả thông tin nhân viên có sự thay đổi từ ihrp
	@GetMapping("/")
	public ResponseEntity<Iterable<Employee>> getAllEmployee(){
		System.out.println("aaa");
		return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
	}
	// lấy thông tin chỉ 1 nhân viên có sự thay đổi từ ihrp theo mã nhân viên
	@GetMapping("/{id}")
	  public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
        Optional<Employee> employeeOptional = employeeService.findById(id);
        return employeeOptional.map(employee -> new ResponseEntity<>(employee, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	// cập nhật trạng thái đồng bộ thông tin nhân viên của mic cho ihrp
	@PutMapping("/{id}")
    public ResponseEntity<Employee> updateCategory(@PathVariable String id, @RequestBody Employee employee) {
        Optional<Employee> employeeOptional = employeeService.findById(id);
        return employeeOptional.map(employee1 -> {employee.setMaNv(employee1.getMaNv());
            return new ResponseEntity<>(employeeService.save(employee), HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
}
	// lấy tất cả thông tin cơ cấu bị thay đổi từ ihrp
	
	// cập nhật trạng thái đồng bộ cơ cấu của mic cho ihrp
}
