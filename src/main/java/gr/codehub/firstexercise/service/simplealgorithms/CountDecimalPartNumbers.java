package gr.codehub.firstexercise.service.simplealgorithms;

public class CountDecimalPartNumbers {
    int count;

    public float getDecimalPart(float number){
        int intPart = (int)number;
        return number - intPart;
    }

    public int countDecimalFromDouble(double number){
        count = 0;
        String numberConvert = Double.toString(number);
        boolean flag = false;
        for (char c: numberConvert.toCharArray()) {
            if (flag)
                count += 1;
            if (c == '.')
                flag = true;
        }

        // 32.144003
//        int intPart = (int)number;
//        number -= (double)intPart;
//        String numberConvertion = String.valueOf(number);
//        System.out.println(numberConvertion.length()-2);

        return count;
    }

}
