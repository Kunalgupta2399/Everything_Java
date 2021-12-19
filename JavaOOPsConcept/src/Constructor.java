public class Constructor {
    /*
    is a block of code that is similar to method , at the time of calling constructor
    , memory for the object is allocated in the memory
    it is a special type of method which is used to initialize the object.
    object created every time using new() keyword.

    RULES TO CREATE CONSTRUCTOR
    1.name is same as class name
    2.no return type
    3.java constructor cannot be abstract , static , final and synchronized


    TYPES OF CONSTRUCTOR
    1.parameterised  = when some data type pass in the method.
    2. default = when you did not pass any parameter.
     */

    // Default constructor Example
    class Bike1 {
        Bike1() {
            System.out.println("Bike is created");
        }
    }

    public void main(String[] args) {
        Bike1 b = new Bike1();

    }

    //parameterized constructor example
    class student {
        int id;
        String name;

        public student(int i, String n) {
            id = i;
            name = n;
        }

        public  void print(){
            System.out.println(id+" "+name);
        }

        public void main(String[] args) {
            student s1 = new student();
            student s2 = new student();
            s1.print();
            s2.print();
        }
    }

    /*
    Constructor overloading?
    when in method there is more than one constructor with different
    parameter list , all have different value  by putting some another
    parameter like when some constructor have age , number , id and another
    has age , number , id, Date of birth. at that one constructor id differ from another by 1 term
     */

    //DIFFERENCE BETWEEN CONSTRUCTOR AND METHOD
    /*
    Java Constructor	Java Method
A constructor is used to initialize the state of an object.	A method is used to expose the behavior of an object.
A constructor must not have a return type.	A method must have a return type.
The constructor is invoked implicitly.	The method is invoked explicitly.
The Java compiler provides a default constructor if you don't have any constructor in a class.	The method is not provided by the compiler in any case.
The constructor name must be same as the class name.	The method name may or may not be same as the class name.

     */


}
