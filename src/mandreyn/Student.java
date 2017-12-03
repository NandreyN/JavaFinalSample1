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
        int groupCompResult = new Integer(this.group).compareTo(o.getGroup());
        if (groupCompResult != 0)
            return groupCompResult;

        int averageCompRes = new Double(this.averageMark).compareTo(o.getAverageMark());
        if (averageCompRes != 0)
            return averageCompRes;

        return this.getName().compareTo(o.getName());
    }
    public String toString()
    {
        return "Name: " + getName() + ", group: " + getGroup() + ", Average mark: " + getAverageMark();
    }
}
