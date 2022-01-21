import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.i = 1;
        object.j = 2;
        object.display();
    }

    class A {
        int i = 0;

        void display() {
            System.out.println(i);
        }
    }

    class B extends A {
        int j = 0;

        void display() {
            System.out.println(j);
        }
    }

}


