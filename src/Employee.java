class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId();
        System.out.println(emp1.getNextId());
        System.out.println(Employee.getNextId());

    }
}

class Employee {
    private static int nextId = 1;
    private int id;

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        return nextId; // returns static field
    }
}
