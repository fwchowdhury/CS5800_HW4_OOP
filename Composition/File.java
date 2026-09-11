public class File {
    private String fileName;
    
    // Constructor
    public File(String fileName) {
        this.fileName = fileName;
    }
    
    // Getters
    public String getFileName() {
        return fileName;
    }
    
    // Setters
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    // Print
    public void print() {
        System.out.println("  - " + fileName);
    }
}