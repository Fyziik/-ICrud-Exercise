public class DBRepository implements ICrud {



    @Override
    public boolean create(Person person) {
        //Add person to DB
        return false;
    }

    @Override
    public boolean delete(Person person) {
        //Delete person from DB
        return false;
    }

    @Override
    public boolean update(Person old, Person updated) {
        //Find person in DB and update query
        return false;
    }

    @Override
    public void read(Person person) {
        //Idk, probably search for a person and read data??

    }
}
