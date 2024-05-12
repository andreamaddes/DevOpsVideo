package devopsvideo;

import com.cemiltokatli.passwordgenerate.Password;
import com.cemiltokatli.passwordgenerate.PasswordType;

public class PassGen {
    
    public static String generatePassword(){
        Password pass = Password.createPassword();
        pass.setType(PasswordType.SYMBOLS);
        pass.setMinLength(20);
        pass.setMaxLength(50);
        return pass.generate();
    }

    public static void main(String[] args) {
        System.out.println(generatePassword());
    }
    

}
