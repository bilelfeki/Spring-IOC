package bilel;

/**
 * This is the first type of the Email Checker
 * which support a low level of  security
 */
public class SecureEmail implements EmailChecker {
    @Override
    public boolean checkEmail() {
        return true ;
    }
}
