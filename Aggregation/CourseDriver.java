public class CourseDriver {
    public static void main(String[] args) {
        // Create instructor
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        
        // Create textbook
        Textbook textbook = new Textbook("Clean Code", "Robert Martin", "Prentice Hall");
        
        // Create course
        Course course = new Course("Advanced Software Engineering", instructor, textbook);
        
        // Print course info
        course.print();
    }
}