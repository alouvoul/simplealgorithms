package gr.codehub.firstexercise.service.simplealgorithms;

public class HarmonicSeries {

    public double calculateHarmonicSeries(int n){
        double harmonic = 0;
        for (int i = 1; i <= n; i++){
            harmonic += 1.0/i;
        }

        return harmonic;
    }

}
