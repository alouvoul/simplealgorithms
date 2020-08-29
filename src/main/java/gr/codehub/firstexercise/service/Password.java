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
    short CRITERIA_TOTAL_NUMBER = 6;

    /**
     * Called to check a password if met the criteria. Organizes the steps to be completed.
     * @param password Text given by the user
     * @return TRUE if the password is acceptable, FALSE if doesn't met the criteria
     */
    public boolean validation(String password){
        criteria[Criteria.UPPERCASE.ordinal()] = upperCaseLetter(password);
        criteria[Criteria.LOWERCASE.ordinal()] = lowerCaseLetter(password);
        criteria[Criteria.ONE_NUMBER.ordinal()] = containNumber(password);
        criteria[Criteria.SPECIAL_CHARACTER.ordinal()] = specialCharacter(password);
        criteria[Criteria.PASSWORD_LENGTH.ordinal()] = size(password);
        criteria[Criteria.SEQUENCE_CHARACTERS.ordinal()] = sequenceCharacters(password);
        System.out.println(Arrays.toString(criteria));

        printCriteria();
        return checkCriteria();
    }

    /**
     * Prints the appropriate messages to the console. Uses the class variable to specify the problem and doesn't require
     * args.
     */
    private void printCriteria() {
        // If criteria don't met
        if (!checkCriteria()){
            System.out.println("1. Password contains at least one uppercase character ");
            System.out.println("2. Password contains at least one lowercase character");
            System.out.println("3. Contains at least one number ");
            System.out.println("4. Contains at least one special character (e.g., !, _ etc) ");
            System.out.println("5. Password length must be at least 8 characters long ");
            System.out.println("6. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");
            return;
        }

        // If all the criteria met
        if (numberOfCriteriaMet() == CRITERIA_TOTAL_NUMBER){
            System.out.println("Very Strong password");
            return;
        }

        // If criteria 5 and 6 met
        if (criteria[4] && criteria[5]){
            System.out.println("Strong password");
            return;
        }

        // If criteria 3 and 6 met OR criteria 4 and 6 prints the message
        if ((criteria[2] && criteria[5]) || (criteria[3] && criteria[5]))
            System.out.println("Password OK");

    }

    /**
     * Calculates the total number of criteria which are met in the password
     * @return Total number of the criteria that met in the password.
     */
    private int numberOfCriteriaMet() {
        short total = 0;
        for (boolean c : criteria) {
            if (c)
                total++;
        }
        return total;
    }

    /**
     *
     * @return
     */
    private boolean checkCriteria(){
        if (!criteria[4])
            return false;

        if(!totalCriteriaMet())
            return false;
        return true;
    }

    /**
     *
     * @return True if the criteria are more than or equal to 3, False otherwise
     */
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

    /**
     * Check in a string if there are sequential or consecutive characters. Each of the have not to exceed 3 in number.
     * Consecutive: java123, abcjava, javaabapython == TRUE. java, java12, abdc == FALSE
     * Identical: aaaataszxc, javaaaa, ja111va == TRUE, zxcdf, java12python, jaava == FALSE
     * @param password Text to be checked if contain one of the two types.
     * @return TRUE if both of them not met, FALSE otherwise
     */
    private boolean sequenceCharacters(String password){
        // consecutive "abc" == TRUE adbc == FALSE
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
