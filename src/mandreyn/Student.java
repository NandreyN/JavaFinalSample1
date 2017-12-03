package mandreyn;

public class Student implements Comparable<Student> {
    String name;
    int group;
    double averageMark;

    public Student(String name, int group, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
        this.group = group;
    }

    public Student(String strInitData) throws InvalidFileFormatException {
        String splited[] = strInitData.split(" ");
        if (splited.length != 3)
            throw new InvalidFileFormatException("Invalid file format. Use : Name Group AverageMark\n with space sa delimiter ");

        try {
            name = splited[0];
            group = Integer.parseInt(splited[1]);
            averageMark = Double.parseDouble(splited[2]);
        }
        catch(IllegalArgumentException e)
        {
            throw new InvalidFileFormatException("Invalid file format. Use : Name Group AverageMark\n with space sa delimiter ");
        }
    }

    public String getName() {
        return name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int compareTo(Student o) {
        return new Double(this.averageMark).compareTo(o.getAverageMark());
    }
    public String toString()
    {
        return "Name: " + getName() + ", group: " + getGroup() + ", Average mark: " + getAverageMark();
    }
}
