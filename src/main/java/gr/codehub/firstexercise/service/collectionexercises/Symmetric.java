package gr.codehub.firstexercise.service.collectionexercises;

public class Symmetric {

    public boolean symmetricString(String text){
        int i = 0, j = text.length()-1;

        while (i < text.length()/2){
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}
