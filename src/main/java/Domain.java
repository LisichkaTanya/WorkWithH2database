import entity.Address;
import entity.EmplProj;
import entity.Employee;
import entity.Project;
import service.AddressService;
import service.EmplProjService;
import service.EmployeeService;
import service.ProjectService;

import java.sql.SQLException;
import java.util.Calendar;

public class Domain {
    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();
        EmplProjService emplProjService = new EmplProjService();

        Address address = new Address();
        address.setId(1L);
        address.setCountry("Russia");
        address.setCity("Moscow");
        address.setStreet("Novii Arbat, 10");
        address.setPostCode("110110");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Tatiana");
        employee.setLastName("Solomatina");
        employee.setAddressID(address.getId());
        Calendar calendar = Calendar.getInstance();
        calendar.set(1982, Calendar.JULY, 15);
        employee.setBirthday(new java.sql.Date(calendar.getTime().getTime()));

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Java course");

        EmplProj emplProj = new EmplProj();
        emplProj.setEmployeeId(employee.getId());
        emplProj.setProjectId(project.getId());

        try {
            addressService.add(address);
            employeeService.add(employee);
            projectService.add(project);
            emplProjService.add(emplProj);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
