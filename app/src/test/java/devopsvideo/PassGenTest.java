package devopsvideo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PassGenTest {
    
    @Test
    void MinMaxLength(){
        String generatedpassword = PassGen.generatePassword();
        assertTrue(generatedpassword.length() >= 20 && generatedpassword.length() <= 50,
         "Password must be min 20 and max 50 characters.");
    }

    @Test
    void PassComposition(){
        String generatedpassword = PassGen.generatePassword();
        assertTrue(generatedpassword.matches("^[^a-zA-Z0-9]*$"), "Password must be only symbols.");
    }

}
