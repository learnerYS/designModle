package Composite;

/**
 * 组合模式
 */
public class Demo {
    public static void main(String[] args){
        Employee ceo = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        headSales.getList().add(salesExecutive1);
        headSales.getList().add(salesExecutive2);

        headMarketing.getList().add(clerk1);
        headMarketing.getList().add(clerk2);

        ceo.getList().add(headMarketing);
        ceo.getList().add(headSales);



        System.out.println(ceo);
        for (Employee employee : ceo.getList()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getList()) {
                System.out.println(employee1);
            }
        }
    }

}
