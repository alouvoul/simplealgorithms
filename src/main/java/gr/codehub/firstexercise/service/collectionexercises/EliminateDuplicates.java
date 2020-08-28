package gr.codehub.firstexercise.service.collectionexercises;

import java.util.ArrayList;
import java.util.HashSet;

public class EliminateDuplicates {

    public ArrayList<Integer> eliminateDuplicatesList(ArrayList<Integer> list){

        return new ArrayList<>(new HashSet<>(list));
    }

}
