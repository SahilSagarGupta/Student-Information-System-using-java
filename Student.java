// Student.java
import java.util.ArrayList;

class Student extends Person implements Grade {
    private String studentId;
    private ArrayList<Course> courseList;
    private ArrayList<Double> grades;
    private static int studentCount = 0; // Static variable to keep track of students

    // Constructor
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);  // Call to Person class constructor
        this.studentId = studentId;
        this.courseList = new ArrayList<>();
        this.grades = new ArrayList<>();
        studentCount++;  // Increment student count when a new student is created
    }

    // Static method to get the student count
    public static int getStudentCount() {
        return studentCount;
    }

    // Add course to the student's course list
    public void addCourse(Course course) {
        courseList.add(course);
    }

    // Add grade to the student's grade list
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Implementing calculateGrade method from Grade interface
    @Override
    public double calculateGrade() {
        if (grades.isEmpty()) return 0;
        double total = 0;
        for (Double grade : grades) {
            total += grade;
        }
        return total / grades.size();  // Return average grade
    }

    // Display student's information
    public void displayStudentInfo() {
        displayInfo();  // Call to Person class method
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses Enrolled: ");
        for (Course course : courseList) {
            course.displayCourseInfo();
        }
        System.out.println("Average Grade: " + calculateGrade());
    }
}