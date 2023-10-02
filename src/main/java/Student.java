import java.util.Objects;

public class Student extends Human {

    private String facultyName;
    private int courseNumber;

    public Student() {
        super("some name", "some surname", "some patronymic", 0);
        this.facultyName = "some facultyName";
        this.courseNumber = 0;
    }

    public Student(String name, String surname, String patronymic, int age, String facultyName, int courseNumber) {
        super(name, surname, patronymic, age);
        this.facultyName = facultyName;
        this.courseNumber = courseNumber;
    }

    public Student(Human human, String facultyName, int courseNumber) {
        super(human.getName(), human.getSurname(), human.getPatronymic(), human.getAge());
        this.facultyName = facultyName;
        this.courseNumber = courseNumber;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return courseNumber == student.courseNumber && Objects.equals(facultyName, student.facultyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facultyName, courseNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyName='" + facultyName + '\'' +
                ", courseNumber=" + courseNumber +
                '}';
    }
}
