package gr.codehub.firstexercise.service.collectionexercises;

import java.util.ArrayList;

public class Stack {

    ArrayList<Long> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(long number){
        stack.add(number);
    }

    public long pop(){

        if( isEmpty() ){
            System.out.println("The stack is empty!");
            System.exit(1);
        }

        long number = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return number;
    }

    public long peek(){

        if( isEmpty() ){
            System.out.println("The stack is empty! Program terminates!");
            System.exit(1);
        }

        return stack.get(stack.size() - 1);
    }

    protected boolean isEmpty(){
        return stack.size() == 0;
    }
}
