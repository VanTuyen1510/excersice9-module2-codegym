package ss10_generic_stack_queue.excercise;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElementInArrayUsingStack {
    static int myArray[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line :");
        int size = sc.nextInt();
        myArray = new int[size];

        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < myArray.length ; i++) {
            System.out.println("Eenter the element of the array:" + i);
            myArray[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            myStack.push(myArray[i]);
        }

        for (int i = 0; i < size; i++) {
           myArray[i] = myStack.pop(); // pop lấy từ ra từ cuối lấy lên
            System.out.println(myArray[i]);
        }






    }
}
