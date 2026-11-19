import java.util.ArrayList;
import java.util.Scanner;

// Stack Interface
interface Stack {
    void push(String url);
    String pop();
    String peek();
    boolean isEmpty();
    void display();
}

// Helper class for growing the Stack
class GrowStack {
    ArrayList<String> list = new ArrayList<>();

    void add(String url) {
        list.add(url);
    }

    String remove() {
        return list.remove(list.size() - 1);
    }

    String getTop() {
        return list.get(list.size() - 1);
    }
}

// Implementing Stack using String List
class StringList implements Stack {
    GrowStack stack = new GrowStack();

    public void push(String url) {
        stack.add(url);
        System.out.println("Visited: " + url);
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("No previous history!");
            return null;
        }
        return stack.remove();
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("History is empty!");
            return null;
        }
        return stack.getTop();
    }

    public boolean isEmpty() {
        return stack.list.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("History is empty!");
            return;
        }

        System.out.println("Browser History:");
        for (int i = stack.list.size() - 1; i >= 0; i--) {
            System.out.println(stack.list.get(i));
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringList browser = new StringList();
        int choice;

        do {
            System.out.println("\n1. Visit Website");
            System.out.println("2. Backtrack");
            System.out.println("3. Current Website");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.push(url);
                    break;

                case 2:
                    if (!browser.isEmpty()) {
                        browser.pop();
                        String current = browser.peek();
                        if (current != null) {
                            System.out.println("Back to: " + current);
                        }
                    } else {
                        System.out.println("No history!");
                    }
                    break;

                case 3:
                    String current = browser.peek();
                    if (current != null) {
                        System.out.println("Current: " + current);
                    }
                    break;

                case 4:
                    browser.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}