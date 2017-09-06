

import java.util.ArrayList;
import java.util.Scanner;

public class ch19_2 {

    public static void main(String[] args) {

        GenericStack1<String> stack = new GenericStack1<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 strings: ");
        for (int i = 0; i < 5; i++)
            stack.push(input.next());

        System.out.println("reverse order: ");
        for(int i = 0; i < 5; i++){
            System.out.println(stack.pop());
        }

    }


}

class GenericStack1<E> extends ArrayList<E> {


    public E peek() {
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + toString();
    }
}