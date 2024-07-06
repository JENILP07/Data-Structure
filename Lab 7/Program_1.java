import java.util.Scanner;

class Stack {
    private int size;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (top < size - 1) {
            stackArray[++top] = element;
            System.out.println("Pushed " + element + " into the stack.");
        } else {
            System.out.println("Stack overflow! Cannot push element.");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack underflow! Cannot pop element.");
            return -1;
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.println("Current stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public int peep() {
        if (top >= 0) {
            System.out.println("Top element: " + stackArray[top]);
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public void change(int index, int newValue) {
        if (index >= 0 && index <= top) {
            stackArray[index] = newValue;
            System.out.println("Changed element at index " + index + " to " + newValue + ".");
        } else {
            System.out.println("Invalid index! Cannot change element.");
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nSTACK OPERATIONS");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep (View top element)");
            System.out.println("5. Change (Modify element)");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.peep();
                    break;
                case 5:
                    System.out.print("Enter index to change (0-based): ");
                    int index = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    stack.change(index, newValue);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
