package Employee;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1 == e2){
            return 0;
        }
        if (e1 == null || !(e1 instanceof Employee)) {
            return 1;
        }
        if (e2 == null || !(e2 instanceof Employee)) {
            return -1;
        }

        if (e1.getEmployeeId() > e2.getEmployeeId()){
            return -1;
        }else if (e1.getEmployeeId() < e2.getEmployeeId()) {
            return 1;
        }
        return 0;
    }
}
