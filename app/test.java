package app;

import implementation.ProjectList;
import implementation.TaskList;
import model.Project;
import model.Task;
import ui.UI;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws IOException {

        TaskList tl = new TaskList();
        Project p = new Project();
        ProjectList pl = new ProjectList();
        /*Task t = new Task();*/
        UI ui = new UI();
        Scanner scan = new Scanner(System.in);
        String answer = null;

        do {
            tl.createTask();
            System.out.println("Do you want to create another task?");
            answer = scan.next();
        }
        while(answer.equalsIgnoreCase("yes"));

        FileOutputStream TaskFile = new FileOutputStream("TaskFile.txt");
        Iterator <Task> iterator = tl.getAllTaskLists().iterator();

        try(Writer writer = new BufferedWriter(new OutputStreamWriter(TaskFile, "utf-8"))){
            writer.write(("Task ID  Tasks                 Due Date     Project     Status\n-------------------------------------------------------\n"));
            while (iterator.hasNext()){
                Task task = iterator.next();
                writer.write(task.toString());
            }
        }
        finally {
            TaskFile.close();
        }

        System.out.println("Writing completed");

        System.out.println(tl.findTask(1));

        tl.removeTasks(2);
        tl.updateStatus(1);
        ui.printHeader();
        tl.printTasks();










/*
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        FileWriter writer = new FileWriter("output.txt");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: " + i);
            int num = scanner.nextInt();
            list.add(num);
        }

        for(int num: list){
            writer.write(num + System.lineSeparator());
        }
        writer.close();
        System.out.println(list);
      */
/*  for(int num: list){
            System.out.println(list);
        }*/


    }
}
