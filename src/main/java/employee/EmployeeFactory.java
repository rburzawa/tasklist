package employee;

public class EmployeeFactory {

    public Employee create(EmployeeType employeeType, int id, String fullName, String externalId) {
        if (EmployeeType.TECHNICIAN.equals(employeeType)){
            return new Technician(id, fullName, externalId, employeeType);
        } else if (EmployeeType.DISPATCHER.equals(employeeType)){
            return new Dispatcher(id, fullName, externalId, employeeType);
        } return null;

    }
}
