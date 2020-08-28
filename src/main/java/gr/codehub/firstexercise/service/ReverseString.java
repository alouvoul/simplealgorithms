package gr.codehub.firstexercise.service;
import java.util.Stack;
public class ReverseString {
    Stack<Character> stack;

    public ReverseString() {
        stack = new Stack<Character>();
    }

    public String reverse(String text){
        StringBuilder reverseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
            stack.push(text.charAt(i));

        while (!stack.isEmpty()){
            reverseText.append(stack.pop());
        }
        return reverseText.toString();
    }
}
