package bolum_12_collection_framework._1_list_interface;

import java.util.LinkedList;
import java.util.Stack;

public class _10StackKullanimi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Vector classını extends ettiği için methodları ortaktır.
        // Kendine özgü methodları:

        // stack boş ise true return eder.
        System.out.println("IsEmpty? " + stack.empty());

        // FIFO presibiyle çalışır:
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // stack'in en üstündeki elemanı return eder.
        System.out.println(stack.peek());

        stack.clear();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // stack'e eleman arar. eleman konumunu, bulunamazsa -1 return eder.
        System.out.println("En üstteki elemanın konumu: " + stack.search(4));
        System.out.println("En alttaki elemanın konumu: " + stack.search(1));

        // Stack yerine linkedList kullanırız.

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.peek());
    }
}
