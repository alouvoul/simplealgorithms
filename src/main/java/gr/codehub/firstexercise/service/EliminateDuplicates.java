package gr.codehub.firstexercise.service;

import java.util.ArrayList;
import java.util.HashSet;

public class EliminateDuplicates {

    public ArrayList<Integer> eliminateDuplicatesList(ArrayList<Integer> list){

        return new ArrayList<Integer>(new HashSet<Integer>(list));
    }

}
