package model;

import java.util.ArrayList;

public class Project {

    private String projectTitle;
    private ArrayList<Task> projectTasks = new ArrayList<>();

    public Project() {
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public ArrayList<Task> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(ArrayList<Task> projectTasks) {
        this.projectTasks = projectTasks;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public void addProjectTasks(Task task){
        projectTasks.add(task);
    }

    /*public void removeProjectTasks(String taskID){
        if()
    }*/

    public String toString(){
        return getProjectTitle();
    }


}
