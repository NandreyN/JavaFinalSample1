package mandreyn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Reader reader = new Reader("numbers.txt", "students.txt");
            List<Student> students = reader.getStudentsCollection();
            List<Double> numbers = reader.getNumbersCollection();
            Container<Double> numbersCollection  = new Container<>();
            for(Double number : numbers)
                numbersCollection.add(number);

            System.out.println(numbersCollection.getMin());

        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
