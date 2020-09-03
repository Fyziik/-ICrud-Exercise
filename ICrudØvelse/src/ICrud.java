import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface ICrud {

        boolean create(Person person) throws IOException;
        boolean delete(Person person);
        boolean update(Person old, Person updated) throws IOException;
        void read() throws FileNotFoundException;

}
