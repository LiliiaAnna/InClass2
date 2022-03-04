package midtermreviewcodeforpartc;

public class PasswordValidator {
    private static int specialCharCount = 0;
    private static int minNumSpicialChar = 1;

    // checking if the value is valid
    public static boolean isValidate(User user){
        // iterate over each character to see if it is a special character
        for (char sym : user.getPassword().toCharArray()) {
            if (!Character.isLetterOrDigit(sym)) specialCharCount++;
            // if there is a space then return false
            if (Character.isSpaceChar(sym)) return false;
        }
        // password check
        if (specialCharCount >= minNumSpicialChar && user.getPassword().length() >= 8) {
            specialCharCount = 0; // reset, because variable of type static
            return true;
        }
        // if no block worked then return false
        return false;
    }
    // get and set the minimum number of special characters
    public static int getMinCoutSpicialChar(){ return minNumSpicialChar; }
    public static void setMinCoutSpicialChar(int num){ minNumSpicialChar = num; }
}
