package main;

import location.model.Location;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Location location = new Location(1, "Lodz", "93-232", "Lodowa", "101");
        Task task = new Task(1, "Instalacja", "Instalacja sprzetu klienta",
                null, Status.OPEN, false, LocalDate.now(), null,
                null, Priority.LOW, location, null, null);

        Task task2 = new Task.TaskBuilder()
                .withId(2)
                .withTitle("Naprawa")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary("Summary")
                .withStatus(Status.OPEN)
                .build();

    }
}
