package activity2;

public class Student {
    int studentId;
    String firstName, middleName, lastName, gender, email;
    public Object enrollStudent;

    static int totalStudents = 0;

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;

        totalStudents++;
    }

    public void displayStudentInfo() {
        System.out.println("\n-----Student Information-----");
        System.out.println("Student ID: " + studentId);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);

    }

    public static int getTotalStudents() {
        return totalStudents;
    }

}
