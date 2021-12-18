public class ObjectAndClasses {
    public static void main(String[] args) {
        /*
        what is object in brief and its main points?
        = entity that has state and behaviour called object .
        1.state = represent data(value).
        2.behaviour = what it do like pen name parker , which behaviour is writing
        3.Identity = its uniqueness or its ID or your view.

            Object definition
            1.object is real world part
            2. object is run time entity
            3. object is entity which has state and behaviour
            4. object is instance of class
         */

        /*
        Class? class is a group of object which have common properties
        1.Field
        2.Methods
        3.Blocks
        4.Constructors
        5.Nested classes and interface
         */

        // Syntax to declare class
        class kunal {
            //field
            //Method
        }
        /*
        Instance? which create inside the class but outside the method called instance variable
         */
        /*
        Method in Java? is like a function that expose the behaviour of object.
        Advantage of method
        1.Code resizability
        2.code optimisation
         */

        //Object and class Example
        class student{
            int id = 2399;
            String name = "Kunal";
        }
        //now we do program in main
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}
