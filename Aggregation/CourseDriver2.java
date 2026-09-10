public class CourseDriver2 {
    public static void main(String[] args) {
        // Create first instructor and textbook
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert Martin", "Prentice Hall");
        
        // Create second instructor and textbook
        Instructor instructor2 = new Instructor("Salam", "Salloum", "3-2700");
        Textbook textbook2 = new Textbook("Design Patterns", "Gang of Four", "Addison-Wesley");
        
        // Create courses with different combinations
        Course course1 = new Course("Advanced Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Object Oriented Design", instructor2, textbook2);
        
        // Print course info
        System.out.println("=== Course 1 ===");
        course1.print();
        
        System.out.println("=== Course 2 ===");
        course2.print();
    }
}