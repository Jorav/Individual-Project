package implementation;

import model.Project;
import model.Task;
import ui.UI;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TaskList {

    /*   private String input;*/
    Scanner scanner = new Scanner(System.in);
    private List<Task> allTaskLists = new ArrayList<>();
    UI ui = new UI();

    public List<Task> getAllTaskLists() {
        return allTaskLists;
    }

    public void setAllTaskLists(List<Task> allTaskLists) {
        this.allTaskLists = allTaskLists;
    }

    public void addTasks(Task task) {
        this.getAllTaskLists().add(task);
    }

    public Task findTask(int taskId){
        for(Task task: allTaskLists){
            if (task.getTaskId() == taskId){
                return task;
            }
        }
        return null;
    }
    public void removeTasks(int taskId) {
        Task tmpTask;
        tmpTask = this.findTask(taskId);
        this.getAllTaskLists().remove(tmpTask);
    }

    public void createTask() throws IOException {

        //Inputting Task Title
        System.out.println("Enter the task title: ");
        String title = scanner.next();

        //Inputting Task Date
        System.out.println("Enter the due date for the task: ");
        String dateString = scanner.next();
        LocalDate localDate = LocalDate.parse(dateString);
        //Inputting Project Title
        System.out.println("Which project is this task under?");
        String projectTitle = scanner.next();
        Task task = new Task(title, localDate, projectTitle);
        this.addTasks(task);

 /*       //Writing To File
        FileOutputStream TaskFile = new FileOutputStream("TaskList.txt");

        Iterator <Task> iterator = allTaskLists.iterator();

        Writer writer = new BufferedWriter(new OutputStreamWriter(TaskFile, "utf-8")){

        }*/

    }

    public void updateStatus(int taskId){
        Task tmpTask;
        tmpTask = this.findTask(taskId);
        tmpTask.setTaskComplete(true);

    }

    public void sortByProject(){


    }

    public void printTasks() {

        ui.printTaskList(allTaskLists);

    }
}
