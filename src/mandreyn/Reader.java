package mandreyn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

public class Reader {
    private List<Student> students;
    private List<Double> numbers;

    public Reader(String numbersFilepath, String studentsFilepath) throws FileNotFoundException, InvalidFileFormatException {
        students = new ArrayList<>();
        numbers = new ArrayList<>();
        initNumbers(numbersFilepath);
        initStudents(studentsFilepath);
    }

    private void initStudents(String path) throws FileNotFoundException, InvalidFileFormatException {
        File file = new File(path);
        if (!file.exists())
            throw new FileNotFoundException("File not found : "  + path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
            students.add(new Student(scanner.nextLine()));
        }
    }

    private void initNumbers(String path) throws FileNotFoundException, InvalidFileFormatException {
        File file = new File(path);
        if (!file.exists())
            throw new FileNotFoundException("File not found : "  + path);

        Scanner scanner = new Scanner(file);
        String inputLine = scanner.nextLine();
        String[] splittedInputLine = inputLine.split("\\s+");

        try {
            for (String doubleString : splittedInputLine) {
                numbers.add(Double.parseDouble(doubleString));
            }
        }
        catch(IllegalArgumentException e)
        {
            throw  new InvalidFileFormatException("Format numbres file as single line with digits separated by spaces");
        }
    }

    public List<Student> getStudentsCollection() {
        return students;
    }

    public List<Double> getNumbersCollection() {
        return numbers;
    }
}
