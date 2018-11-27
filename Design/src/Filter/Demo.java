package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 */
public class Demo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Criteria singleMale = new CriteriaAnd(single, male);
        Criteria singleOrFemale = new CriteriaOr(single, female);

        List<Person> list = singleMale.meetCriteria(persons);
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("\n");
        List<Person> list1 = singleOrFemale.meetCriteria(persons);
        for (Person person : list1) {
            System.out.println(person);
        }
    }
}
