package gr.codehub.firstexercise.service;

import java.util.ArrayList;
import java.util.Collections;

public class OrderDigits {

    public ArrayList<Integer> descendingOrderInt(int number){

        ArrayList<Integer> orderedDigits = new ArrayList<Integer>();
        while (number > 0){
            orderedDigits.add(number % 10);
            number = number / 10;
        }
        Collections.sort(orderedDigits, Collections.reverseOrder());
        return orderedDigits;
    }

    public void descendingOrderDouble(int number){
        // TODO
    }

}
