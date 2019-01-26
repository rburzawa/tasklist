package main;

import employee.Employee;
import employee.EmployeeFactory;
import employee.EmployeeType;
import location.model.Location;
import location.model.location.LocationRepository;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Location location = new Location(1, "Lodz", "93-232", "Lodowa", "101");
        //LocationRepository locationRepository = new LocationRepository();
        LocationRepository locationRepository = LocationRepository.getInstance();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee technician1 = employeeFactory.create(EmployeeType.TECHNICIAN, 1, "AB", "123B");
        Employee technician2 = employeeFactory.create(EmployeeType.TECHNICIAN, 2, "EF", "564F");
        Employee dispatcher = employeeFactory.create(EmployeeType.DISPATCHER, 1, "CD", "345D");

        Task task = new Task(1, "Instalacja", "Instalacja sprzetu klienta",
                null, Status.OPEN, false, LocalDate.now(), null,
                null, Priority.LOW, location, null, null);

        Task task2 = new Task.TaskBuilder(3, "Naprawa")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary("Summary")
                .withStatus(Status.OPEN)
                .withLocation(locationRepository.findbyId(2))
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();

        task2.setAssignedUserExternalId(technician1.getExternalId());

        Task task3 = new Task.TaskBuilder(2, "Zadanie 2")
                .withDescription("Sprawdzanie")
                .withLocation(locationRepository.findbyId(3))
                .build();


    }
}
