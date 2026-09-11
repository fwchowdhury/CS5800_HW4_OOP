import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    
    // Constructor
    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }
    
    // Getters
    public String getFolderName() {
        return folderName;
    }
    
    public ArrayList<File> getFiles() {
        return files;
    }
    
    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }
    
    // Setters
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    
    // Add file
    public void addFile(File file) {
        files.add(file);
    }
    
    // Add subfolder
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }
    
    // Remove file
    public void removeFile(File file) {
        files.remove(file);
    }
    
    // Remove subfolder
    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
    }
    
    // Print folder and contents recursively
    public void print(String indent) {
        System.out.println(indent + "[" + folderName + "]");
        
        // Print files
        for (File f : files) {
            System.out.print(indent + "  ");
            f.print();
        }
        
        // Print subfolders recursively
        for (Folder sub : subFolders) {
            sub.print(indent + "  ");
        }
    }
}