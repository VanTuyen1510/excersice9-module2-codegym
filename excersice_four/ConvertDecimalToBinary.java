package ss10_generic_stack_queue.excersice_four;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();

        Stack<Integer> myStack = new Stack<>();
        int sumBinary;
        while (number > 0){
            sumBinary = number % 2;
            myStack.push(sumBinary);
            number /= 2;
        }
        String str = "";
        while (!myStack.isEmpty()) {
           str += myStack.pop();
        }
        System.out.print(str);

    }
}
