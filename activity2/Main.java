package activity2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.getTotalStudents());

        // create 3 object for 3 students
        Student student1 = new Student(251057, "Louise Nicole", "Ninobla", "Madriaga", "Female", "louisenicolemadriaga@lorma.edu");
        Student student2 = new Student(251, "Lavigne", "Ninobla", "Madriaga", "Female", "lavignemadriaga@lorma.edu");
        Student student3 = new Student(121, "Janet", "Ninobla", "Madriaga", "Female", "janetmadriaga@lorma.edu");

        System.out.println(Student.getTotalStudents());

        // display their information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();


        // print the school name
        Course.getSchoolName();
        Course course1 = new Course("CS101", "Introduction to Programming");
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course1.displayCourseInfo();
    }
}
