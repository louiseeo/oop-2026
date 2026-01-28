package activity2;

public class Student {
    int studentId;
    String firstName, middleName, lastName, gender, email;

    static int totalStudents = 0;

    //public Student(){}

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender; 
        this.email = email;

        totalStudents++;
    }

    public void displayStudentInfo(){
       for (Student s : )
    }

    public static int getTotalStudents(){
        return totalStudents;
    }
    
}
