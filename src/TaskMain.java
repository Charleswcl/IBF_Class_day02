package src;

import java.util.*;


public class TaskMain {
    
    public static void main(String[] args) {

        List<Car> tasks = new LinkedList<Car>();
        Set<String> names = new HashSet<>();
        Map<String, Integer> debts = new HashMap<>();
       
        // Add cars to garage
        garage.add(new Car());
        garage.add(new Porsche());

        // Add names to my addressbook
        addressbook.add("fred");
        addressbook.add("barney");
        addressbook.add("wilma");
        addressbook.add("fred");

        // Add my debtors
        debts.put("fred", 10);
        debts.put("barney", 10);
        debts.put("fred", 100);
        System.out.println(debts);
    }
}
