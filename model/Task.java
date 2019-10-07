package model;

import java.util.Date;

public class Task {
    private int taskId;
    private String title;
    private Date dueDate;
    private boolean taskComplete;
    Project project;

    public Task() {
    }

    public Task(int taskId, String title, Date dueDate) {
        this.taskId = taskId;
        this.title = title;
        this.dueDate = dueDate;
        this.taskComplete = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.dueDate = date;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return dueDate;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String isTaskComplete() {
        String status;
        if(taskComplete == true){
            status = "COMPLETED";
        }
        else{
            status = "NOT DONE";
        }
        return status;
    }

    public void setTaskComplete(boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

}
