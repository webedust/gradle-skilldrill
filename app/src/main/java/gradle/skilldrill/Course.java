package gradle.skilldrill;

public class Course
{
    // Variables
    private int number;
    private String subject;
    private String title;


    // Constructors
    public Course() {}
    public Course(int num, String subj, String t)
    {
        number = num;
        subject = subj;
        title = t;
    }

    // Methods
    public void setNumber(int num) { number = num; }
    public void setSubject(String subj) { subject = subj; }
    public void setTitle(String title) { this.title = title; }

    public int getNumber() { return number; }
    public String getSubject() { return subject; }
    public String getTitle() { return title; }


    public String toString() { return number + " " + subject + " " + title; }
}
