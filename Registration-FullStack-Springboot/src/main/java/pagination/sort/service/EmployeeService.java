package pagination.sort.service;

import org.springframework.data.domain.Page;
import pagination.sort.model.Employee;

import java.util.List;


public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page<Employee> findPaginated(int pageNo, int PageSize, String sortField, String sortDirection);
}
