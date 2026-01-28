package activity2;

public class Course {
    String courseCode, courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;
    
    static String schoolName = "My University";
    
    public Course(){}

    public Course(String courseCode, String courseTitle){
        this.enrolledStudents = new Student[50];

    }

    public void enrollStudent(Student student){
        enrolledStudents[enrollmentCount] = student;
        enrollmentCount++;
    }

    public void displayCourseInfo(){
        
    }

    public static String getSchoolName(){
        return schoolName;
    }
}

