package bilel;

/**
 * The Email is instantiated only if the Email is checked :
 * --High security checking --
 * --low security checking
 */
public class EmailClient {
    private EmailChecker security  ;
    /**
     * the Email checker is not instantiated in the constructor
     * ==> Dependency Injection with the constructor
     * @param security
     */
    public EmailClient(EmailChecker security ){
        this.security=security ;
        System.out.println("your Email is "+ security.getClass());
    }

}
