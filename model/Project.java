package model;

import java.util.ArrayList;

public class Project {

    private String projectTitle;
    private ArrayList<Task> taskList = new ArrayList<>();

    public Project() {
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String toString(){
        return getProjectTitle();
    }
}
