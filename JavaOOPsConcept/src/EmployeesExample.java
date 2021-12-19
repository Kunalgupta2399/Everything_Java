public class EmployeesExample {
    int id;
    String name;
    float salary;

    public void insert(int i, float s, String n) {
        id = i;
        name = n;
        salary = s;
    }

    public void print() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        EmployeesExample e1 = new EmployeesExample();
        EmployeesExample e2 = new EmployeesExample();
        EmployeesExample e3 = new EmployeesExample();

        e1.insert(2399,90909 , "kunal");
        e2.insert(8010,8987 , "Sahil");
        e3.insert(9010,3423 , "Vinay");

        e1.print();
        e2.print();
        e3.print();
    }
}
