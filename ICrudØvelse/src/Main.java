import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Person p1 = new Person("Andreas", 88888888, 1);
        Person p2 = new Person("Jørgen", 12345678, 2);
        Person p3 = new Person("Mathias", 87654321, 3);

        ICrud ArrayListRepo = new ArrayListRepository();
        ICrud FileRepo = new FileRepository();
        ICrud DBRepo = new DBRepository();
        List<ICrud> repos = new ArrayList<>();

        repos.add(ArrayListRepo);
        repos.add(FileRepo);
        repos.add(DBRepo);

        //Do stuff to each repo
        for (ICrud repository : repos) {
            // 'create' person using each repo
            repository.create(p1);
            repository.create(p2);
            repository.create(p3);
            // 'read' person using each repo
            repository.read();
            // 'update' person using each repo


            // 'delete person using each repo
        }

    }
}
