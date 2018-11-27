package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaOr implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public CriteriaOr(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list = criteria.meetCriteria(persons);
        List<Person> list1 = otherCriteria.meetCriteria(persons);
        ArrayList<Person> people = new ArrayList<>();
        for (Person person : list) {
            people.add(person);
        }
        for (Person person : list1) {
            people.add(person);
        }
        return people;
    }
}
