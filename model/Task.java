package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Task {
    private int taskId = 0;
    private static int counter = 1;
    private String title;
    private LocalDate dueDate;
    private boolean taskComplete;
    private String projectTitle;
    private Scanner scan = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

    public Task(String title, LocalDate dueDate, String projectTitle) {

        this.taskId = counter++;
        this.title = title;
        this.dueDate = dueDate;
        this.projectTitle = projectTitle;
        this.taskComplete = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

/*    public void setTaskId(){
        this.taskId;
    }*/

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return dueDate;
    }

   /* public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
*/
    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String isTaskComplete() {
        String status;
        if (taskComplete == true) {
            status = "COMPLETED";
        } else {
            status = "NOT DONE";
        }
        return status;
    }

    public void setTaskComplete(boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    @Override
    public String toString(){
        return this.getTaskId() + "  " + this.getTitle() + "  " + this.getDate() + "   " + this.getProjectTitle() + "   "
                       + this.isTaskComplete() + "\n";
    }

}
