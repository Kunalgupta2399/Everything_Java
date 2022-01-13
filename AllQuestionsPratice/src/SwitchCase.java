import java.util.Scanner;

public class SwitchCase {
    public class Stack {
        int top;
        String[] data;

        Stack() {
            top = -1; // if stack is empty
            data = new String[100];
        }

        void push(String input) {
            if (top == data.length - 1) {
                System.out.println("overFlow");
                return;
            }
            top++;
            data[top] = input;
        }

        String pop() {
            if (top == -1) {
                System.out.println("UnderFlow Stack is empty");
                return null;
            }
            String topData = data[top];
            data[top] = null;
            top--;
            return topData;
        }

        String peek() {
            if (top == -1) {
                System.out.println("UnderFlow Stack is empty");
                return null;
            }
            String topData = data[top];
            return topData;
        }

        void print() {
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }

    public class StackRunner {
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

            int choice;
            do {
                menu();
                System.out.println("Enter Your Choice");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        peek();
                        break;
                    case 4:
                        print();
                        break;
                }
            } while (choice != 5);
            System.out.println("Quitting");
        }

    }

    private static void print() {

    }

    private static void peek() {
    }

    private static void pop() {
    }

    private static void push() {
    }

    private static void menu() {
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.peek");
        System.out.println("4.print");
        System.out.println("5.QUIT");
    }
}
