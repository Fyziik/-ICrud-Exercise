import java.util.ArrayList;

public class ArrayListRepository implements ICrud{

    ArrayList<Person> persons = new ArrayList<>();

    @Override
    public boolean create(Person person) {
        if (person != null) {
            persons.add(person);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Person person) {
        if (persons.contains(person)) {
            persons.remove(person);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Person old, Person updated) {
        if (persons.contains(old)) {
            persons.remove(old);
            persons.add(updated);
            return true;
        }
        return false;
    }

    @Override
    public void read(Person person) {
        for (Person tmp : persons) {
            System.out.println(tmp);
        }
    }
}
