import java.util.Scanner;
public class StringArray {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: \n");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the elements: \n");
        sc.nextLine();
        for(i = 0; i < size; i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the element to search: ");
        String[] Target = sc.nextLine();
        StringSearch obj 
    }
}
