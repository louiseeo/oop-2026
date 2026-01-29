package activity2;

public class Course {
    String courseCode, courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;

    static String schoolName = "\nMy University";

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];

    }

    public void enrollStudent(Student student) {
        enrolledStudents[enrollmentCount] = student;
        enrollmentCount++;
    }

    public void displayCourseInfo() {
        System.out.println(schoolName);
        System.out.println(courseCode + " " + courseTitle);
        System.out.println("Enrolled Students: " + enrollmentCount);

        for (int i = 0; i < enrollmentCount; i++) {
            enrolledStudents[i].displayStudentInfo();
            System.out.println();
        }

    }

    public static String getSchoolName() {
        return schoolName;
    }
}
