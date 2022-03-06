package bilel;

/**
 * we have more than type of type checker that's why
 * all  Email checkers should implement this interface
 */
public interface EmailChecker {
    /**
     * this method return true if the Email is verified
     */
    public boolean checkEmail() ;

}
