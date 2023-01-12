package cyleng.me.demo.dao;
import cyleng.me.demo.model.Person;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);

    Optional<Person> selectPersonById(UUID id);
}