package gr.codehub.firstexercise.service.collectionexercises;

import java.util.ArrayList;
import java.util.Collections;

public class OrderDigits {

    public ArrayList<Integer> descendingOrderInt(int number){

        ArrayList<Integer> orderedDigits = new ArrayList<>();
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
