package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> people = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("female")){
                people.add(person);
            }
        }
        return people;
    }
}
