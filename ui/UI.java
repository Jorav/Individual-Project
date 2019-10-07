package ui;

import implementation.TaskList;
import model.Task;

import java.util.ArrayList;

public class UI {

    public void printHeader() {
        System.out.println("Task ID  Tasks                 Due Date     Project     Status");
    }

    private String fixLengthString(String start, int length) {
        if (start.length() >= length) {
            return start.substring(0, length);
        } else {
            while (start.length() < length) {
                start += " ";
            }
            return start;
        }
    }

    public void printTask(Task task) {
        String taskIdString = String.valueOf(task.getTaskId());
        String taskDateString = String.valueOf(task.getDate());
        String taskStatusString = String.valueOf(task.isTaskComplete());
        System.out.println(fixLengthString(taskIdString, 7) + "  " + fixLengthString(task.getTitle(), 20) + "  "
                                   + fixLengthString(taskDateString, 11) + "  " + fixLengthString(task.getProject().getProjectTitle(), 12)
                                   + fixLengthString(taskStatusString, 10));
    }

    public void printTaskList(ArrayList<Task> allTaskList) {
        for (Task task : allTaskList) {
            if (task != null) {
                printTask(task);
            }
        }

    }
}
