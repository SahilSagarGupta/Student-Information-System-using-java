// GraduateStudent.java
class GraduateStudent extends Student {
    private String thesisTopic;

    // Constructor
    public GraduateStudent(String name, int age, String address, String studentId, String thesisTopic) {
        super(name, age, address, studentId);
        this.thesisTopic = thesisTopic;
    }

    // Method to display thesis topic
    public void displayThesisTopic() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }

    // Overriding displayStudentInfo to include thesis topic
    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();  // Call to Student class method
        displayThesisTopic();  // Display thesis topic
    }
}