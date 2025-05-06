import java.util.ArrayList;
import java.util.List;

// Component
interface FileSystemItem {
    void display(String indent);
}

// Leaf
class File implements FileSystemItem {
    private String name;

    File(String name) {
        this.name = name;
    }

    public void display(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}

// Composite
class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public void display(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for (FileSystemItem item : items) {
            item.display(indent + "  ");
        }
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");

        File a = new File("a.txt");
        File b = new File("b.pdf");

        Folder subFolder1 = new Folder("Photos");
        subFolder1.add(new File("pic1.jpg"));
        subFolder1.add(new File("pic2.jpg"));

        Folder subFolder2 = new Folder("Documents");
        subFolder2.add(new File("resume.docx"));

        root.add(a);
        root.add(b);
        root.add(subFolder1);
        root.add(subFolder2);

        root.display("");
    }
}
