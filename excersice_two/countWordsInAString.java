package ss10_generic_stack_queue.excersice_two;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in ");
        String word = sc.nextLine();
        word = word.toLowerCase();

        Map<Character,Integer> mapWord = new TreeMap<>();
        // split: cắt từ gặp dấu cách lấy đằng trước
        // phương thức contains() tìm kiếm ký tự trong chuỗi này

        for (int i = 0; i < word.length(); i++) {
           char keyMap = word.charAt(i);
           if(mapWord.containsKey(keyMap)){
               mapWord.put(keyMap,mapWord.get(keyMap) + 1);
           }
           else {
               mapWord.put(keyMap,1);
           }
        }
        for (Character key: mapWord.keySet()) {
            System.out.println(key + " - " + mapWord.get(key) );
        }
    }
}
