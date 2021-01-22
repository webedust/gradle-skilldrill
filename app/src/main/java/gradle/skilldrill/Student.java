package gradle.skilldrill;

import java.util.ArrayList;

public class Student
{
    // Variables
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses = new ArrayList<>();


    // Constructors
    public Student() {}
    public Student(String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
    }


    // Methods
    public void setFirstName(String name) { firstName = name; }
    public void setLastName(String name) { lastName = name; }
    public void setCourses(ArrayList<Course> courses) {this.courses = courses; }
    public void addCourse(Course course) { courses.add(course); }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public ArrayList<Course> getCourses() { return courses; }


    public String toString() { return firstName + " " + lastName; }
}