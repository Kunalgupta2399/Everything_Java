public class ObjectAndClassesExample {
    //Object and Class Example: Initialization through reference
    class student {
        int id;
        String name;
    }

    class TestStudent {
        public void main(String[] args) {
            student s1 = new student();
            s1.name = "kunal";
            s1.id = 2399;
            System.out.println(s1.name + " " + s1.id);
        }
    }

    // 2nd Method
    class Student1 {
        int id;
        String name;
    }

    class TestStudent3 {
        public void main(String args[]) {
            //Creating objects
            Student1 s1 = new Student1();
            Student1 s2 = new Student1();
            //Initializing objects
            s1.id = 101;
            s1.name = "Sonoo";
            s2.id = 102;
            s2.name = "Amit";
            //Printing data
            System.out.println(s1.id + " " + s1.name);
            System.out.println(s2.id + " " + s2.name);
        }
    }
}
