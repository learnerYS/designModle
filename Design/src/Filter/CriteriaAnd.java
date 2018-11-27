package Filter;

import java.util.List;

public class CriteriaAnd implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public CriteriaAnd(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> people = criteria.meetCriteria(persons);
        List<Person> list = otherCriteria.meetCriteria(people);
        return list;
    }
}
