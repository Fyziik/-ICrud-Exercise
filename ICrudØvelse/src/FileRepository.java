import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileRepository implements ICrud {



    @Override
    public boolean create(Person person) throws IOException {

        if (ifExist(person)) {
            update(person, person);
        }
        else {
            writeToFile(person);
        }
        return true;
    }


    @Override
    public boolean update(Person old, Person updated) throws IOException {
        // 'old' & 'updated' is actually the same object, also is basically a conjunction of delete and writeToFile methods
        // could be done better but I'm lazy
        delete(updated);
        writeToFile(updated);
        return true;
    }

    public boolean ifExist(Person person) {
        return new File("Files/" + person.getID()).isFile();
    }

    public void writeToFile(Person person) throws IOException {
        PrintWriter writer = new PrintWriter("Files/" + person.getID(), StandardCharsets.UTF_8);
        writer.println("Name: " + person.getName());
        writer.println("Phone number: " + person.getPhoneNumber());
        writer.println("ID: " + person.getID());
        writer.close();
    }

    @Override
    public boolean delete(Person person) {
        File file = new File("Files/" + person.getID());
        file.delete();
        return true;
    }

    @Override
    public void read() throws FileNotFoundException {
        System.out.println('\n' + "Files repo: ");
        File[] files = new File("Files").listFiles();
        for (File file : files) {
            Scanner in = new Scanner(new FileReader("Files/" + file.getName()));
            if (file.isFile()) {
                while (in.hasNext()) {
                    System.out.println(in.nextLine());
                }
            }
        }
    }
}
