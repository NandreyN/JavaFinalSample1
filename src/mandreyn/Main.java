package mandreyn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*try {
            Container<Double> doubleContainer = new Container<Double>();
            File in = new File("in.txt");
            if (!in.exists() || in.isDirectory())
                throw new FileNotFoundException("File not found");

            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNextDouble()) {
                    doubleContainer.add(lineScanner.nextDouble());
                }
            }
            System.out.println(Arrays.toString(doubleContainer.toArray()));
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }*/
        Container<Student> students = new Container<>();
        students.add(new Student("Andrety", 1, 8.5));
        students.add(new Student("Mark", 1, 5.88));
        students.add(new Student("Oleg", 1, 4.58));
        students.add(new Student("Student2", 3, 6.54));
        students.add(new Student("Student3", 2, 4.4));
        System.out.println(students.getMin());
    }
}
