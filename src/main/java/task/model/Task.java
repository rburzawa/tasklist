package task.model;

import location.model.Location;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private int id;
    private String title;
    private String description;
    private String summary;
    private Status status;
    private boolean done;
    private LocalDate createDate;
    private LocalDate dueDate;
    private List<Skill> requiredSkills;
    private Priority priority;
    private Location location;
    private String createUserExternalId;
    private String assignedUserExternalId;

}
