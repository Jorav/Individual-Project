package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectRead {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(44);
        person.setName("Johan TA");

        String fileName = "objectRead.txt";
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(person);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}