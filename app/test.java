package app;

import implementation.TaskList;
import model.Task;
import ui.UI;
import java.io.*;

public class test {

    public static void main(String[] args) throws IOException {

        TaskList tl = new TaskList();
        Task t = new Task();
        UI ui = new UI();
        tl.createTasks();
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
