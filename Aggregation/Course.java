public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;
    
    // Constructor
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    
    // Getters
    public String getCourseName() {
        return courseName;
    }
    
    public Instructor getInstructor() {
        return instructor;
    }
    
    public Textbook getTextbook() {
        return textbook;
    }
    
    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }
    
    // Print function
    public void print() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        System.out.println();
    }
}