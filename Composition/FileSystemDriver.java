public class FileSystemDriver {
    public static void main(String[] args) {
        // Create main folder
        Folder phpDemo = new Folder("php_demo1");
        
        // Create subfolders
        Folder sourceFiles = new Folder("Source Files");
        Folder app = new Folder("app");
        Folder publicFolder = new Folder("public");
        Folder config = new Folder("config");
        
        // Add files to Source Files
        sourceFiles.addFile(new File("index.php"));
        sourceFiles.addFile(new File("database.php"));
        sourceFiles.addFile(new File("functions.php"));
        
        // Add files to app
        app.addFile(new File("controller.php"));
        app.addFile(new File("model.php"));
        
        // Add files to public
        publicFolder.addFile(new File("style.css"));
        publicFolder.addFile(new File("script.js"));
        
        // Add files to config
        config.addFile(new File("settings.ini"));
        
        // Build structure
        phpDemo.addSubFolder(sourceFiles);
        phpDemo.addSubFolder(app);
        phpDemo.addSubFolder(publicFolder);
        phpDemo.addSubFolder(config);
        
        // Print initial structure
        System.out.println("=== Initial Structure ===");
        phpDemo.print("");
        System.out.println();
        
        // Delete app folder
        phpDemo.removeSubFolder(app);
        System.out.println("=== After Deleting 'app' Folder ===");
        phpDemo.print("");
        System.out.println();
        
        // Delete public folder
        phpDemo.removeSubFolder(publicFolder);
        System.out.println("=== After Deleting 'public' Folder ===");
        phpDemo.print("");
    }
}