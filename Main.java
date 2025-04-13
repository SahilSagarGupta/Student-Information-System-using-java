// Main.java
public class Main {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Math 101", "M101", 3);
        Course course2 = new Course("Physics 101", "P101", 4);

        // Create Student objects
        Student student1 = new Student("John Doe", 20, "123 Elm Street", "S001");
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addGrade(85);
        student1.addGrade(90);

        // Create GraduateStudent objects
        GraduateStudent gradStudent1 = new GraduateStudent("Jane Smith", 25, "456 Oak Street", "G001", "Quantum Physics");
        gradStudent1.addCourse(course1);
        gradStudent1.addGrade(95);
        gradStudent1.addGrade(98);

        // Display student info
        System.out.println("Student 1 Info:");
        student1.displayStudentInfo();
        System.out.println("Total Students: " + Student.getStudentCount());
        System.out.println();

        System.out.println("Graduate Student 1 Info:");
        gradStudent1.displayStudentInfo();
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}