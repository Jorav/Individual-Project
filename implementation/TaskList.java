package implementation;

import model.Project;
import model.Task;
import ui.UI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskList {

    /*   private String input;*/
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Task> allTaskLists = new ArrayList<>();
    Task task = new Task();
    UI ui = new UI();
    Project project = new Project();

    public void createTasks() {

        task.setTaskId(1);
        //Asking for task title
        System.out.println("Add a new task: ");
        String taskTitle = scanner.nextLine();

        //Setting task title
        task.setTitle(taskTitle);

        //Asking for due date
        System.out.println("Enter a due date for the task: ");
        String dateString = scanner.next();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        //Setting task due date
        try {
            Date date = format.parse(dateString);
            task.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Asking for project
        System.out.println("Which project is this task under?");
        String projectTitle = scanner.next();
        project.setProjectTitle(projectTitle);
        task.setProject(project);

        task.setTaskComplete(false);

        allTaskLists.add(task);
    }

    public void printTasks() {

        ui.printTaskList(allTaskLists);

    }
}
