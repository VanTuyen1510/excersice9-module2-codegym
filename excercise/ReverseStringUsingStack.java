package ss10_generic_stack_queue.excercise;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line :");
        String mWord = sc.nextLine();

        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(String.valueOf(mWord.charAt(i))); // charAt cắt từ thành từng chuỗi 1 ,còn value of sử dụng để chuyển đổi kiểu dữ liệu khác thành chuỗi
        }
        while (!wStack.isEmpty()) {
            mWord = wStack.pop();
            System.out.println(mWord);
        }
    }
}
