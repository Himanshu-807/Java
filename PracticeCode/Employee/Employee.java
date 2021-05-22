package Employee;

public class Employee implements Comparable{
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object e1){
        if (e1 == null || !(e1 instanceof Employee)) {
            return false;
        }

        Employee that = (Employee)e1;
        if (this.employeeId == that.getEmployeeId()
                    && this.name.equals(that.getName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.employeeId;
    }


    @Override
    public int compareTo(Object e1) {
        if (e1 == null || !(e1 instanceof Employee)) {
            return 1;
        }
        Employee that = (Employee)e1;
        if (this.employeeId > that.getEmployeeId()){
            return 1;
        }else if (this.employeeId < that.getEmployeeId()) {
            return -1;
        }
        return 0;
    }
}

// e1.CompareTo(null)  null, e1
// 0 equal
// < 0 e1 < e2
// > 0 e1 > e2

// e = abc, 1234
//123

// e2 = abc, 12343
//123

// e == e2 true

// 1 3 4 2 0
// 0 1 2 3 4

//  e > e2

