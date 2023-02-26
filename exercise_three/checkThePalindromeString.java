package ss10_generic_stack_queue.exercise_three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Alba";
        String  [] myArr = str.split(" ");

        Stack<String> stackStr = new Stack<>();
        Queue<String> queueStr = new LinkedList<>();
        for (int i = 0; i < myArr.length; i++) {
            stackStr.push(myArr[i]);
            queueStr.offer(myArr[i]);
        }

        boolean check = false;
        while (!stackStr.isEmpty()) {
            if (!stackStr.pop().equals(queueStr.remove())) {
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("This is Palindrome");
        }else {
            System.out.println("This is not Palindrome");
        }
    }
}



