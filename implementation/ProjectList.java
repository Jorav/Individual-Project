package implementation;

import model.Project;

import java.util.ArrayList;

public class ProjectList {

    private ArrayList<Project> projectList = new ArrayList<>();

    public ArrayList<Project> getProjects() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public void addProject(Project project) {
        this.getProjects().add(project);
    }

}
