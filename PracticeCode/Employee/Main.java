package Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("xyz", 1);
        Employee e2 = new Employee("xyz", 1);
        Employee e3 = new Employee("xyzsa", 4);
        Employee e4 = e3;
        if (e1.equals(e2)) {
            System.out.println("E1 equals e2");
        }
        if (e2.equals(e3)) {
            System.out.println("E2 equals e3");
        }
        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(e1, "puneet");
        System.out.println(map.get(e3));

    }
}
