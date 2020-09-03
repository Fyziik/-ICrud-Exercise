public class DBRepository implements ICrud {



    @Override
    public boolean create(Person person) {
        //TODO create should use DBManager class, and 'insert into' via query a person into the DB
        //Add person to DB
        return false;
    }

    @Override
    public boolean delete(Person person) {
        //TODO delete should 'delete from (tableName) where ID = ?' via query from the DB by the ID attribute
        //Delete person from DB
        return false;
    }

    @Override
    public boolean update(Person old, Person updated) {
        //TODO update should 'update where ID = ?' via query from the DB by the ID attribute
        //Find person in DB and update query
        return false;
    }

    @Override
    public void read() {
        //TODO read should print every person in DB, via 'select * (tableName) via query from the DB
        System.out.println('\n' + "DB repo: ");
        //Idk, probably search for a person and read data??

    }
}
