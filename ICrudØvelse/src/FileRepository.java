import java.io.*;
import java.util.Scanner;

public class FileRepository implements ICrud {



    @Override
    public boolean create(Person person) throws IOException {

        if (new File("Files/" + person.getName()).isFile()) {
            update(person, person);
            return true;
        }
        else {
            PrintWriter writer = new PrintWriter("Files/" + person.getName(), "UTF-8");
            writer.println("Name: " + person.getName());
            writer.println("Phone number: " + person.getPhoneNumber());
            writer.println("ID: " + person.getID());
            writer.close();
            return true;
        }
    }

    @Override
    public boolean delete(Person person) {
        return false;
    }

    @Override
    public boolean update(Person old, Person updated) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("Files/" + old.getName());
        file.delete();
        PrintWriter writer = new PrintWriter("Files/" + old.getName(), "UTF-8");
        writer.println("Name: " + old.getName());
        writer.println("Phone number: " + old.getPhoneNumber());
        writer.println("ID: " + old.getID());
        writer.close();
        return true;
    }

    @Override
    public void read(Person person) throws FileNotFoundException {
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
