import java.util.Locale;
import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //passwordLengthValidation(password);
if(passwordLengthValidation(password) && isConsistonlyLettersAndDigits(password)
&& hasAtLeast3Digits(password)){
    System.out.println("Valid pass");
}else{
    System.out.println("Invalid pass");
}
    }
public static boolean passwordLengthValidation(String password) {
    if(password.length() >=6 && password.length() <=10){
        return true;
    }return false;
    // return password.length() >=6 && password.length() <=10
}
    public static boolean isConsistonlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if(((symbol < 48 || symbol >57)) && (symbol < 97 || symbol > 122)){
                return false;
            }
        }
        return true;
    }
    public static boolean hasAtLeast3Digits(String password) {
       int count =0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if(symbol >= 48 && symbol <=57){
                count++;
            }
        }return count>=3;
    }
}
