package gr.codehub.firstexercise.service;
import java.util.regex.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Password {

    String password;
    boolean[] criteria = new boolean[6];


    public boolean validation(String password){
        criteria[0] = upperCaseLetter(password);
        criteria[1] = lowerCaseLetter(password);
        criteria[2] = containNumber(password);
        criteria[3] = specialCharacter(password);
        criteria[4] = size(password);
        criteria[5] = sequenceCharacters(password);
        System.out.println(Arrays.toString(criteria));

        printCriteria();
        return checkCriteria();
    }

    private void printCriteria() {

        if (!checkCriteria()){
            System.out.println("1. Password contains at least one uppercase character ");
            System.out.println("2. Password contains at least one lowercase character");
            System.out.println("3. Contains at least one number ");
            System.out.println("4. Contains at least one special character (e.g., !, _ etc) ");
            System.out.println("5. Password length must be at least 8 characters long ");
            System.out.println("6. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");
            return;
        }

        if (numberOfCriteriaMet() == 6){
            System.out.println("Very Strong password");
            return;
        }

        if (criteria[4] && criteria[5]){
            System.out.println("Strong password");
            return;
        }

        if ((criteria[2] && criteria[5]) || (criteria[3] && criteria[5]))
            System.out.println("Password OK");

    }

    private int numberOfCriteriaMet() {
        short total = 0;
        for (boolean c : criteria) {
            if (c)
                total++;
        }
        return total;
    }

    private boolean checkCriteria(){
        if (!criteria[4])
            return false;

        if(!totalCriteriaMet())
            return false;
        return true;
    }

    private boolean totalCriteriaMet() {
        return numberOfCriteriaMet() > 2;
    }

    private boolean upperCaseLetter(String password){
        return password.matches(".*[A-Z].*");
    }

    private boolean lowerCaseLetter(String password){
        return password.matches(".*[a-z].*");
    }

    private boolean containNumber(String password){
        return password.matches(".*[1-9].*");
    }

    private boolean specialCharacter(String password){
        return password.matches(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
    }

    private boolean size(String password){
        return (password.length()>=8);
    }

    private boolean sequenceCharacters(String password){
        // consecutive
        Pattern p = Pattern.compile(".*(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|nop|opq|pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678)+.*");
        Matcher matcher = p.matcher(password);
        boolean consecutive = matcher.matches();

        // identical aaaataszxc == TRUE, zxcdf == FALSE
        Pattern p1 = Pattern.compile(".*(?i)(?:([a-z0-9])\\1{2,}).*");
        Matcher matcher1 = p1.matcher(password);
        boolean sequential = matcher1.matches();
        return (!consecutive) && (!sequential);
    }

}
