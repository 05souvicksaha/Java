import java.util.Scanner;

class StringUtil {

// Instance variable
private String[] list;

// Set the size of the instance variable array
public void setList(int length) {
list = new String[length];
}

// Populate instance variable using array received as argument
public void generateList(String[] arr) {
for (int i = 0; i < list.length; i++) {
list[i] = arr[i];
}
}

// Linear search
public int searchList(String key) {
for (int i = 0; i < list.length; i++) {
if (list[i].equals(key)) {
return i;
}
}

return -1;
}

// Display the list
public void getList() {
System.out.println("\nComplete List:");

for (int i = 0; i < list.length; i++) {
System.out.println("Position " + i + " : " + list[i]);
}
}
}

public class TestStringUtil {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Create object
StringUtil obj = new StringUtil();

// Take array length
System.out.print("Enter the length of the array: ");
int length = sc.nextInt();
sc.nextLine();

// Create local array in main
String[] arr = new String[length];

// Take array values in main
System.out.println("Enter the strings:");

for (int i = 0; i < length; i++) {
System.out.print("Enter element " + (i + 1) + ": ");
arr[i] = sc.nextLine();
}

// Set instance variable array length
obj.setList(length);

// Send array from main to StringUtil
obj.generateList(arr);

// Take search key
System.out.print("\nEnter the string to search: ");
String key = sc.nextLine();

// Search
int position = obj.searchList(key);

if (position == -1) {
System.out.println("String not found.");
} else {
System.out.println("String found at position " + position);
}

// Display complete list
obj.getList();

sc.close();
}
}